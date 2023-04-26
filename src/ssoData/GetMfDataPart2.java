package ssoData;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


public class GetMfDataPart2 {

    private static String ebankRpath = "D:\\SSO資料\\user.csv";
    private static String outpath = "D:\\SSO資料\\userData2.log";
    private static ArrayList<UserDataAPB0004> UserList = new ArrayList<UserDataAPB0004>();
    private static HashMap<String, ArrayList<UserDataAPB0004>> nickNamemAP = new HashMap<String, ArrayList<UserDataAPB0004>>();
    //過去一季起始日
    // 1~3  4~6 7~9 10~12
    private static long baseDateBegin = 20211001;
    private static long baseDateEnd = 20211231;

    public static void main(String[] args) throws Exception {


        //======================
        //reader
        //======================
        InputStreamReader isr = new InputStreamReader(new FileInputStream(ebankRpath), "UTF8");
        BufferedReader reader = new BufferedReader(isr);

        String sid;
        String nickname;
        String crtdate = "";
        String mdfdate = "";   //  LASTCHANGE
        String space1 = " ";
        String readline = null;
        System.out.println("read data1 ...");
        while ((readline = reader.readLine()) != null) {
            UserDataAPB0004 data = new UserDataAPB0004();
            String[] dd = readline.split(",");

            sid = dd[1];
            nickname = dd[0];
            crtdate = dd[2];
            mdfdate = dd[3];

            sid = sid.replaceAll("\"", "");
            nickname = nickname.replaceAll("\"", "");
            crtdate = crtdate.replaceAll("\"", "");
            mdfdate = mdfdate.replaceAll("\"", "");

            while (nickname.length() < 18)
                nickname = nickname + " ";

            while (sid.length() < 11)
                sid = sid + " ";

            if (crtdate.length() > 8)
                crtdate = crtdate.substring(0, 8);

            if (mdfdate.length() > 8)
                mdfdate = mdfdate.substring(0, 8);

            data.setSid(sid);
            data.setNickname(nickname);
            data.setCdate(crtdate);
            data.setMdate(mdfdate);

            UserList.add(data);
        }

        for (UserDataAPB0004 data : UserList) {
            String basedate = "0";

            if (data.getMdate().length() >= 8)
                basedate = data.getMdate();
            else
                basedate = data.getCdate();

            if (Long.valueOf(basedate) >= baseDateBegin && Long.valueOf(basedate) <= baseDateEnd) {
                if (nickNamemAP.containsKey(data.getNickname())) {
                    ArrayList<UserDataAPB0004> tmp = nickNamemAP.get(data.getNickname());
                    tmp.add(data);
                    nickNamemAP.put(data.getNickname(), tmp);
                } else {
                    ArrayList<UserDataAPB0004> tmp = new ArrayList<UserDataAPB0004>();
                    tmp.add(data);
                    nickNamemAP.put(data.getNickname(), tmp);
                }
            }
        }

        //======================
        //writer
        //======================

        File writename = new File(outpath);
        writename.createNewFile();
        BufferedWriter out = new BufferedWriter(new FileWriter(writename));
        for (String key : nickNamemAP.keySet()) {

            if (nickNamemAP.get(key).size() > 3) {
                for (UserDataAPB0004 data : nickNamemAP.get(key)) {
                    String basedate = "";

                    if (data.getMdate().length() == 8)
                        basedate = data.getMdate();
                    else
                        basedate = data.getCdate();

                    while (basedate.length() < 8)
                        basedate = basedate + " ";

                    out.write(data.getNickname() + data.getSid() + space1 + basedate + "\r\n");


                }
            }
        }
        out.close();
    }


}


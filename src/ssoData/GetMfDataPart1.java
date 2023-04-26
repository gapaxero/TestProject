package ssoData;

import java.io.*;
import java.util.ArrayList;

//備忘錄 APB0004
//資源申請20210038
//說明：配合備忘錄APB0004，請資管協助執行附件command撈取資料
//資源申請 20210038

//APB0023 
//

/*

配合備忘錄APB0004，請資管協助執行附件command撈取資料(配合登入SSO DB作業，也請安控協助登入)

附件
su - ibkinst
db2
connect to SSODATA

export to user.log of del SELECT NICKNAME,SID,CRTDATE,MDFDATE FROM UPROFILE  

commit
connect reset

*/


/*
 依 法務暨法令遵循部  單位編號:109A90018 會辦單
請提供以下兩個檔案 格式如下 
1.網路銀行使用者代碼(1-18),身份證ID(19-29),空白(30-30),申請或變更日期(31-38) 
>getMfDataPart1 
2.過去一季內有四名以上（含）不同客戶設定相同之「網路銀行使用者代碼」,格式如上                                          
>getMfDataPart2 


 */

public class GetMfDataPart1 {

    private static String ebankRpath = "D:\\SSO資料\\user.csv";
    private static String outpath = "D:\\SSO資料\\userData1.log";
    private static ArrayList<UserDataAPB0004> UserList = new ArrayList<UserDataAPB0004>();
    //過去一季起始日

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
            else
                while (crtdate.length() < 8)
                    crtdate = "0" + crtdate;

            data.setSid(sid);
            data.setNickname(nickname);
            data.setCdate(crtdate);
            data.setMdate(mdfdate);

            UserList.add(data);
        }


        //======================
        //writer
        //======================

        File writename = new File(outpath);
        writename.createNewFile();
        BufferedWriter out = new BufferedWriter(new FileWriter(writename));
        for (UserDataAPB0004 data : UserList) {
            String basedate = data.getCdate();

            while (basedate.length() < 8)
                basedate = "0" + basedate;

            out.write(data.getNickname() + data.getSid() + space1 + basedate + "\r\n");
        }

        out.close();
    }


}



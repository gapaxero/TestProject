package testdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

public class Testarea {

    public static void main(String[] args) {
        String nowTime = getDateTime();
        String beforeMONTH = getCalDateM(nowTime, -1);

//        String dataDATE = beforeMONTH.substring(0, 7).replace("/", "");
//        String dataSDATE = beforeMONTH.substring(0, 8) + "01";
//        String dataEDATE = nowTime.substring(0, 8) + "01";
//        System.out.println("dataDATE: " + dataDATE);
//        System.out.println("dataSDATE: " + dataSDATE);
//        System.out.println("dataEDATE: " + dataEDATE);

        String name = "aa,bb,cc";
        String multiNames = "11,22,33";

        List<String> imageList = new ArrayList<>();
        imageList.add("imageID1"); imageList.add("imageID2"); imageList.add("imageID3");
        imageList.add("imageFS1"); imageList.add("imageFS2"); imageList.add("imageFS3");

        System.out.println(name.split(",").length);
        System.out.println(multiNames.split(",").length);
        System.out.println(imageList.size());

//        System.out.println(doTask(name, imageList));

    }

    public static List<String> doTask(String name, List<String> imageList) {

        String[] nameList = name.split(",");
        List<String> idCardList = new ArrayList<>();

        for (int i = 0; i < nameList.length; i++) {
            idCardList.add(imageList.get(i));
        }

        return idCardList;
    }


    public static String getDateTime() {
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        Date date = new Date();
        String strDate = sdFormat.format(date);
        return strDate;
    }

    public static String toDateString(String yyyyMMddHHmmss, String format) {
        String rlt = "";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
            Date d = sdf.parse(yyyyMMddHHmmss);
            SimpleDateFormat Fmt = new SimpleDateFormat(format);
            rlt = Fmt.format(d);
        } catch (ParseException e) {
            //e.printStackTrace();
        }
        return rlt;
    }

    public static String getCalDateM(String date, int month) {
        //依照提供的日期,計算往前(後)幾天的日期
        String result = "";

        int YYYY = Integer.parseInt(date.substring(0, 4));
        int MM = Integer.parseInt(date.substring(5, 7)) - 1;
        int DD = Integer.parseInt(date.substring(8, 10));

        //日期格式如 20100722
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
        GregorianCalendar cal = new GregorianCalendar(YYYY, MM, DD);
        cal.add(cal.MONTH, month);
        Date d = cal.getTime();
        result = (f.format(d));

        return result;
    }
}

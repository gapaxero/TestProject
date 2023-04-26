package testException;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @Author 1091522
 * @Description
 */
public class TestArea {

    public static void main(String[] args) {

        String str = "N800137838";

        System.out.println(DigestUtils.sha256Hex(str));

//        try {
//            if (str.equals("AAA")) {
//                System.out.println("AA");
//                throw new MingException("777", "AAA");
//            } else {
//                System.out.println("F");
//            }
//        } catch (MingException e) {
//            System.out.println(e.getMessage());
//        }

    }


    public static String checkStr(String str) {

        return str.substring(0, 2);

    }

}

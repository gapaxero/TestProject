package testHash;

import org.apache.commons.codec.digest.DigestUtils;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateMD5 {
    public static void main(String args[]) {

        ArrayList<String> list = new ArrayList<>();
        list.add("698d51a19d8a121ce581499d7b701668");
        list.add("bcbe3365e6ac95ea2c0343a2395834dd");
        list.add("310dcbbf4cce62f762a2aaa148d556bd");
        list.add("fae0b27c451c728867a567e8c1bb4e53");
        list.add("f1c1592588411002af340cbaedd6fc33");

        Scanner scanner = new Scanner(System.in);

        int counter = 0;

//        while (scanner.hasNext()) {
//			String input = scanner.next();
//            if (list.contains(createCodeMD5(String.valueOf(input)))) {
//                counter = 0;
//                System.out.println("Access");
//            } else {
//                counter++;
//                System.out.println("Denied" + counter);
//            }
//
//            if (counter == 5) break;
//
//        }

        String sid = "123456";
        String sid256 = DigestUtils.sha256Hex(sid);
        String sidMd5 = DigestUtils.md5Hex(sid);

        System.out.println(createCodeMD5(sid));
        System.out.println(sidMd5);

//		createCode("111");
//		createCode("222");
//		createCode("333");
//		createCode("666");
//		createCode("777");
    }


    public static String createCodeMD5(String code) {
        String res = "";
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(code.getBytes(StandardCharsets.UTF_8));
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder(bytes.length * 2);
            for (Byte b : bytes) {
                //右移四位, 取字節中前四位轉換
                sb.append(hexDigits[(b >> 4) & 0x0f]);
                //取字節中後四位轉換
                sb.append(hexDigits[b & 0x0f]);
            }
            res = sb.toString();
            System.out.println(sb.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }

    //SHA加密
    private static String shaEncrypt(String strSrc) {
        MessageDigest md;
        String strDes;
        byte[] bt = strSrc.getBytes();
        try {
            md = MessageDigest.getInstance("SHA-256");// 将此换成SHA-1、SHA-512、SHA-384等参数
            md.update(bt);
            strDes = bytes2Hex(md.digest()); // to HexString
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        return strDes;
    }

    //byte数组转换为16进制字符串
    private static String bytes2Hex(byte[] bts) {
        StringBuilder des = new StringBuilder();
        String tmp;
        for (byte bt : bts) {
            tmp = (Integer.toHexString(bt & 0xFF));
            if (tmp.length() == 1) {
                des.append("0");
            }
            des.append(tmp);
        }
        return des.toString();
    }

}
/**
 * 698d51a19d8a121ce581499d7b701668
 * bcbe3365e6ac95ea2c0343a2395834dd
 * 310dcbbf4cce62f762a2aaa148d556bd
 * fae0b27c451c728867a567e8c1bb4e53
 * f1c1592588411002af340cbaedd6fc33
 */
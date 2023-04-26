package tools;

import java.util.Base64;

/**
 * @Author 1091522
 * @Description
 */
public class Base64Tool {

    public static String encodeToString(String bs) {
        return Base64.getEncoder().encodeToString(bs.getBytes());
    }

    public static String encodeToString(byte[] bs) {
        return Base64.getEncoder().encodeToString(bs);
    }

    public static byte[] decode(String string) {
        return Base64.getDecoder().decode(string);
    }

}

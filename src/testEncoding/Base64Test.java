package testEncoding;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @Author 1091522
 * @Description
 */
public class Base64Test {
static final Base64.Decoder decoder = Base64.getDecoder();
static final Base64.Encoder encoder = Base64.getEncoder();

    public static void main(String[] args) throws UnsupportedEncodingException {
        String start = "https://nnb66.ubt.ubot.com.tw/eui/#/mapToApp/?";
        String add  = "台北市中正區八德路一段８２巷１０號";
        String name = "秋葉原店";
        String tel  = "(02)99999999";

        String url =         "SHOPNA="    + Base64.getEncoder().encodeToString(name.getBytes())
                           + "&SHOPADDR=" + Base64.getEncoder().encodeToString(add.getBytes())
                           + "&SHOPTEL="  + Base64.getEncoder().encodeToString(tel.getBytes());

        System.out.println(start + URLEncoder.encode(url, "UTF-8"));
//        System.out.println(URLDecoder.decode(URLEncoder.encode(url, "UTF-8"), "UTF-8"));

//        System.out.println(str_encode);
//        System.out.println(new String(decoder.decode(str_encode), StandardCharsets.UTF_8));

    }

}

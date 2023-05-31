package testHash;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.apache.commons.codec.binary.Hex;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author 1091522
 * @Description
 */
public class EUITest {

    static final String key = "zrbeqMv1XJSz1PTbFj69zrbeqMv";
    static final String euiMac = "MjljODMxZDY0MzVkYWZhZDUyOWZjNDVkZGFiYTczZmUwZTEwMjBhMmYwYzhlOTYzYmMzNTM5YTI2ODUyY2QwMA==";

    public static void main(String[] args) {
        EUI entity = new EUI("EUIV000102312", "20000", "20230401000000", euiMac);

        StringBuilder str = new StringBuilder();

        for (Map.Entry<String, String> entry : getMap(entity).entrySet()) {
            String value = entry.getValue();
            str.append(value);
        }

        System.out.println("串接後字串:" + str);

        String str256 = "";
        String strBase64 = "";

        try {
            str256 = hmacSha256(key, String.valueOf(str));
            strBase64 = Base64.getEncoder().encodeToString(str256.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("EUI: " + euiMac);
        System.out.println("LCL: " + strBase64);
        System.out.println(entity.getMac().equals(strBase64));
    }

    public static TreeMap<String, String> getMap(Object object) {
        ObjectMapper mapper = new ObjectMapper();
        TreeMap<String, String> map = mapper.convertValue(object, new TypeReference<TreeMap<String, String>>() {});
        map.remove("mac");

        return map;
    }

    public static String hmacSha256(String key, String data) throws Exception {
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
        sha256_HMAC.init(secret_key);

        return Hex.encodeHexString(sha256_HMAC.doFinal(data.getBytes(StandardCharsets.UTF_8)));
    }

}

@Data
class EUI {

    private String orderNo;

    private String amount;

    private String timesTemp;

    private String mac;

    public EUI() {}

    public EUI(String orderNo, String amount, String timesTemp, String mac) {
        this.orderNo = orderNo;
        this.amount = amount;
        this.timesTemp = timesTemp;
        this.mac = mac;
    }

}

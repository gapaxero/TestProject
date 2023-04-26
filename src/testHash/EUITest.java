package testHash;

import lombok.Data;
import org.apache.commons.codec.digest.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @Author 1091522
 * @Description
 */
public class EUITest {

    static final String euiData = "ODA4NWUyOGMwMjllOTYyNWQyMjQxYjU2YTdiMmE5MzFjYTJjODlkYTI5ZjM5OWUzNmVmMTBlNGU1ZGEyZjc1Nw==";

    public static void main(String[] args) {
        EUI entity = new EUI("F123456789", "00000012316", "20230401000000");

        StringBuilder str = new StringBuilder();
//        str.append(entity.getArcNo()).append(entity.getAccount()).append(entity.getTimesTemp());
        str.append("arcNo");

        System.out.println("Original Data: " + str);

        String strEncode = "";
        strEncode = DigestUtils.sha1Hex(str.toString());
        strEncode = Base64.getEncoder().encodeToString(strEncode.getBytes(StandardCharsets.UTF_8));

        System.out.println("Decoder: " + new String(Base64.getDecoder().decode(euiData), StandardCharsets.UTF_8));
        System.out.println("DecoderT: " + new String(Base64.getDecoder().decode(strEncode), StandardCharsets.UTF_8));

        System.out.println("EUI: " + euiData);
        System.out.println("TestRes: " + strEncode);

    }

}

@Data
class EUI {

    private String arcNo;

    private String account;

    private String timesTemp;

    public EUI() {
    }

    public EUI(String arcNo, String account, String timesTemp) {
        this.arcNo = arcNo;
        this.account = account;
        this.timesTemp = timesTemp;
    }

}

package tools;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/**
 * @author 1091522
 * @Description
 */
public class StringTools {

    public static String full2half(String str) {
        for (char c : str.toCharArray()) {
            str = str.replaceAll("　", " ");
            if ((int) c >= 65281 && (int) c <= 65374) {
                str = str.replace(c, (char) (((int) c) - 65248));
            }
        }
        return str;
    }

    public static String replaceSpace(String str) {
        return str.replaceAll("(^[　\\s]*)|([　\\s]*$)", "");
    }

    public static String getFixStr(int len, String inCh) {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < len; i++) {
            tmp.append(inCh);
        }
        return tmp.toString();
    }

    public static String getFixStr(String src, int len, String inCh) {
        if (src == null)
            src = "";

        if (src.length() > len)
            return src.substring(0, len);

        StringBuilder srcBuilder = new StringBuilder(src);
        for (int i = srcBuilder.length(); i < len; i++) {
            srcBuilder.append(inCh);
        }
        return srcBuilder.toString();
    }

    public static String getFixStr(String src, int len, String inCh, FixMode mode) {
        if (src == null)
            src = "";

        if (src.length() > len)
            return src.substring(0, len);


        StringBuilder srcBuilder = new StringBuilder(src);
        for (int i = srcBuilder.length(); i < len; i++) {
            if (mode.equals(FixMode.AddRight)) {
                srcBuilder.append(inCh);
            } else {
                srcBuilder.insert(0, inCh);
            }
        }
        return srcBuilder.toString();
    }

    public static String urlEncode(String data) {
        try {
            return URLEncoder.encode(data, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public static String compress4Base64(String data) {
        try {
            return Base64Tool.encodeToString(compress(data.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String uncompress4Base64(String data) {
        try {
            return new String(uncompress(Base64Tool.decode(data)), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] compress(byte[] inputByte) throws IOException {
        int len = 0;
        Deflater defl = new Deflater();
        defl.setInput(inputByte);
        defl.finish();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] outputByte = new byte[1024];
        try {
            while (!defl.finished()) {
                len = defl.deflate(outputByte);
                bos.write(outputByte, 0, len);
            }
            defl.end();
        } finally {
            bos.close();
        }
        return bos.toByteArray();
    }

    public static byte[] uncompress(byte[] inputByte) throws IOException {
        int len = 0;
        Inflater infl = new Inflater();
        infl.setInput(inputByte);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] outByte = new byte[1024];
        try {
            while (!infl.finished()) {
                len = infl.inflate(outByte);
                if (len == 0) {
                    break;
                }
                bos.write(outByte, 0, len);
            }
            infl.end();
        } catch (Exception e) {
            //
        } finally {
            bos.close();
        }
        return bos.toByteArray();
    }

    public static String getDisplacementStr(String content, int num, FixMode fixMode) {
        if (content == null || content.length() == 0)
            return "";

        StringBuilder contentFront = new StringBuilder(content);
        StringBuilder contentBack = new StringBuilder(content);
        StringBuilder result = new StringBuilder();
        int displacementNum = num;

        while (displacementNum > content.length()) {
            displacementNum -= content.length();
        }

        if (fixMode.equals(FixMode.AddRight)) {
            contentFront.delete(0, content.length() - displacementNum);
            contentBack.delete(content.length() - displacementNum, content.length());
        } else {
            contentFront.delete(0, displacementNum);
            contentBack.delete(displacementNum, content.length());
        }

        result.append(contentFront).append(contentBack);

        return result.toString();
    }

    public static String swapParity(String content) {
        if (content == null)
            return "";

        if (content.length() < 2) {
            return content;
        }

        char[] charArray = content.toCharArray();

        for (int i = 0; i < (content.length() / 2); i++) {
            char oddTemp = charArray[i * 2];
            char evenTemp = charArray[i * 2 + 1];
            charArray[i * 2] = evenTemp;
            charArray[i * 2 + 1] = oddTemp;
        }

        return String.valueOf(charArray);
    }

    public static String numberToLetter(int num) {
        if (num <= 0) {
            return null;
        }
        StringBuilder letter = new StringBuilder();
        num--;
        do {
            if (letter.length() > 0) {
                num--;
            }
            letter.insert(0, ((char) (num % 26 + (int) 'A')));
            num = (num - num % 26) / 26;
        } while (num > 0);

        return letter.toString();
    }

    public static int letterToNumber(String letter) {
        int length = letter.length();
        int num;
        int number = 0;
        for (int i = 0; i < length; i++) {
            char ch = letter.charAt(length - i - 1);
            num = ch - 'A' + 1;
            num *= Math.pow(26, i);
            number += num;
        }
        return number;
    }

    public static String getFriendCodeEncode(String friendCode) {
        char[] charArray = getDisplacementStr(swapParity(friendCode), 4, FixMode.AddRight).toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '0') {
                result.append("Z");
            } else {
                if (i % 2 > 0) {
                    result.append(numberToLetter(Character.getNumericValue(charArray[i]) * 2));
                } else {
                    result.append(numberToLetter(Character.getNumericValue(charArray[i])));
                }
            }
        }

        return result.toString();
    }

    public static String getFriendCodeDecode(String friendCode) {
        char[] charArray = friendCode.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'Z') {
                result.append("0");
            } else {
                if (i % 2 > 0) {
                    result.append(letterToNumber(String.valueOf(charArray[i])) / 2);
                } else {
                    result.append(letterToNumber(String.valueOf(charArray[i])));
                }
            }
        }

        return swapParity(getDisplacementStr(result.toString(), 4, FixMode.AddLeft));
    }

}

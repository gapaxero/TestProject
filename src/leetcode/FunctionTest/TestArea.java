package leetcode.FunctionTest;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;
import org.apache.commons.codec.digest.DigestUtils;
import testJackson.JacksonTool.JackTools;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class TestArea {

    public static void main(String[] args) {

        String str = "0,1,2,3,4,5,6";

        String[] list = str.split(",",4);

        for (String s : list) {
            System.out.println(s);
        }

    }

    public void test(Object object) throws ClassNotFoundException {
//        Class clazz = Class.forName(object.getClass().getName());
//        System.out.println(object.getClass().getSimpleName());
//
//        Field[] field = clazz.getDeclaredFields();

        Field[] field = object.getClass().getDeclaredFields();

        for (Field f : field) {
            if (f.getName().equals("ChkMac")) continue;

            f.setAccessible(true);
            System.out.println(f.getName());
        }

    }

    public static boolean checkValidHiLife(pojo33 object) throws UnsupportedEncodingException {

        boolean valid = false;

        String HashKey = "6516f1b2024b";
        String HashIV = "75a8e8da939e";

        String[] strList = {"ParentId", "EshopId", "OrderNo", "EcOrderNo", "RcvStoreId", "OrderDate", "FlowType"};
        JsonNode node = JackTools.readTree(object);

        String checkStr = "";

        for (String s : strList) {
            checkStr += s + "=" + node.get(s).asText() + "&";
        }

        checkStr = "HashKey=" + HashKey + "&" + checkStr + "HashIV=" + HashIV;

        System.out.println(checkStr);

        String encodeStr = URLEncoder.encode(checkStr, StandardCharsets.UTF_8.toString()).toLowerCase();
        String md5Str = DigestUtils.md5Hex(encodeStr).toUpperCase();

        System.out.println(encodeStr);
        System.out.println(md5Str);
        System.out.println("5E84A85A075A044B19DB715E159FCE8E");

        if (object.getChkMac().equals(md5Str)) {
            valid = true;
        }

        return valid;

    }

    public static boolean checkValid33(pojo33 object) throws UnsupportedEncodingException {

        boolean valid = false;

        String HashKey = "e7e10c28d3ec";
        String HashIV = "513cf55d4727";

        String[] strList = {"ParentId", "EshopId", "OrderNo", "EcOrderNo", "RcvStoreId", "OrderDate", "FlowType"};
        JsonNode node = JackTools.readTree(object);

        String checkStr = "";

        for (String s : strList) {
            checkStr += s + "=" + node.get(s).asText() + "&";
        }

        checkStr = "HashKey=" + HashKey + "&" + checkStr + "HashIV=" + HashIV;

        System.out.println(checkStr);

        String encodeStr = URLEncoder.encode(checkStr, StandardCharsets.UTF_8.toString()).toLowerCase();
        String md5Str = DigestUtils.md5Hex(encodeStr).toUpperCase();

        System.out.println(encodeStr);
        System.out.println(md5Str);
        System.out.println("C7EC408B785CB4C0D18CDFBB13DE67D1");

        if (object.getChkMac().equals(md5Str)) {
            valid = true;
        }

        return valid;

    }

    public static boolean checkValid(pojo object) throws UnsupportedEncodingException {

        boolean valid = false;

        String HashKey = "e7e10c28d3ec";
        String HashIV = "513cf55d4727";

        String[] strList = {"ParentId", "EshopId", "OrderNo", "EcOrderNo", "OriginStoreId", "StoreType"};
        JsonNode node = JackTools.readTree(object);

        String checkStr = "";

        for (String s : strList) {
            checkStr += s + "=" + node.get(s).asText() + "&";
        }

        checkStr = "HashKey=" + HashKey + "&" + checkStr + "+" + "HashIV=" + HashIV;

        System.out.println(checkStr);

        String encodeStr = URLEncoder.encode(checkStr, StandardCharsets.UTF_8.toString()).toLowerCase();
        String md5Str = DigestUtils.md5Hex(encodeStr).toUpperCase();

        System.out.println(encodeStr);
        System.out.println(md5Str);
        System.out.println("544F08C0F38AF046FAB78BA92CAAB139");

        if (object.getChkMac().equals(md5Str)) {
            valid = true;
        }

        return valid;

    }

    @Data
    static class pojo33{

        private String ParentId;
        private String EshopId;
        private String OrderNo;
        private String EcOrderNo;
        private String RcvStoreId;
        private String OrderDate;
        private String FlowType;
        private String ChkMac;

    }

    @Data
    static class pojo{

        private String ParentId;
        private String EshopId;
        private String OrderNo;
        private String EcOrderNo;
        private String OriginStoreId;
        private String StoreType;
        private String ChkMac;

    }

}

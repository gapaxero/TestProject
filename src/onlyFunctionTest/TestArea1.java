package onlyFunctionTest;

import lombok.Data;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TestArea1 {

    public static void main(String[] args) {
        Map<String,List<String>>  map = new HashMap<>();



    }

    static void add(String a) {
        Map<String,List<String>>  map = new HashMap<>();
        List<String> list = map.computeIfAbsent(a, Key -> new ArrayList<>());
    }

    static List<String> per(String str) {
        return new ArrayList<>();
    }

    static boolean checkImagesEmpty(byte[] image) {
        return image == null || image.length == 0;
    }

    static boolean aa(byte[] input) {
        return input == null || input.length == 0;
    }

    public static void getdata(String aa, int bb, short cc, List<String> list) {
        System.out.println(aa);
    }

}


//int a = 5; int b = 5;
//
//if(a > 5) {
//	System.out.println("aa");
//}else if(b < 2) {
//	System.out.println("bb");
//}else if(a == b){
//	System.out.println("Same");
//}else {
//	System.out.println("Default");
//}
//
//String res = (a == 1) ? "aa" : (b < 2) ? "bb" : (a == b) ? "Same" : "Default" ;

@Data
class pojo {
    private String name;

    private String age;
}

@Data
class Image {

    private byte[] image1;

    private byte[] image2;

}

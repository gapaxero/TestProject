package testarray;

import tools.StringTools;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("A", "11");
        map.put("B", "22");
        map.put("C", "33");

        System.out.println(map);

        StringTools tools = new StringTools();


    }

}

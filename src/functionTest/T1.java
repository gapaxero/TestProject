package functionTest;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class T1 {

    private static final String str = "AAA";
    private static final int num = 77;

	public static void main(String arg[]) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("aa"); list1.add("aa"); list1.add("aa");
        list2.add("aa"); list2.add("aa"); list2.add("aa");

        System.out.println(list1);
        System.out.println(list2);

        if (list1.isEmpty() ^ list2.isEmpty()) {
            System.out.println("DO");
        } else {
            System.out.println("Exception");
        }

	}

	public static void printString(String... str) {
//		for(String i : str) {
//			System.out.println(i);
//		}

		System.out.println(str[0]);
	}

	public static boolean checkByteSize(byte[] bytes, int sizeLimit, String type) {
        int size = sizeLimit;
        switch (type) {
            case "K":
                size = sizeLimit * 1024;
                break;
            case "M":
                size = sizeLimit * 1024 * 1024;
                break;
        }
        return bytes.length <= size;
    }

}


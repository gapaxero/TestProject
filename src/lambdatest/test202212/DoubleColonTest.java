package lambdatest.test202212;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 1091522
 * @Description
 */
public class DoubleColonTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1"); list.add("2"); list.add("3");

        list.forEach(DoubleColonTest::print);

        list.forEach(new DoubleColonTest()::printStr);



    }

    public static void print(String str) {
        System.out.println(str);
    }

    public void printStr(String str) {
        System.out.println(str);
    }

}

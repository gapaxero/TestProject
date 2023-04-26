package lambdatest.test202212;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 1091522
 * @Description
 */
public class LamTest {

    public static void main(String[] args) {
        LamTest test = new LamTest();

        List<String> list = new ArrayList<>();
        list.add("1"); list.add("2"); list.add("3");

        test.runTest();

        list.stream()
            .filter(inner -> Integer.parseInt(inner) < 3)
            .forEach(str -> {
                str += "aa";
                System.out.println(str);
            });

    }

    public void runTest() {
        Runnable r1 = () -> System.out.println("r1: " + this.getClass());

        Runnable r2 = new Runnable() {
            public void run(){
                System.out.println("r2: " + this.getClass());
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }

    public void doTask() {
        doTask doTask1 = (String str) -> checker(str);
    }

    boolean checker(String str) {
        return str.equals("a");
    }

}

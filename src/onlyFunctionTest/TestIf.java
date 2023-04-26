package onlyFunctionTest;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.Scanner;

public class TestIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            int input1 = scanner.nextInt();
            int input2 = scanner.nextInt();

            System.out.println("intput1:" + input1);
            System.out.println("intput2:" + input2);

            if (input1 > input2) {
                System.out.println("input1 > input2");
            } else if (input1 < input2) {
                System.out.println("input1 < input2");
            } else if (input1 == input2) {
                System.out.println("input1 = input2");
            } else {
                System.out.println("Default");
            }

            String res = input1 > input2 ? "input1 > input2" : input1 < input2 ? "input1 < input2" : input1 == input2 ? "input1 = input2" : "Default";
            System.out.println(res);

            if(input1 == 777 && input2 == 777) {
                scanner.close();
                break;
            }

        }

//        if (a > 5) {
//            System.out.println("aa");
//        } else if (b < 2) {
//            System.out.println("bb");
//        } else if (a == b) {
//            System.out.println("Same");
//        } else {
//            System.out.println("Default");
//        }
//
//        String res = a > 5 ? "aa" : a < 2 ? "bb" : a == b ? "same" : "Default";
//        System.out.println(res);

    }
}

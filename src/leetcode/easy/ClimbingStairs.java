package leetcode.easy;

import org.apache.poi.hssf.model.RecordStream;

public class ClimbingStairs {

    public static void main(String[] args) {

        int n = 45;

        System.out.println(climbStairs(n));
        System.out.println(climbing(n));

    }

    public static int climbing(int n) {
        if(n <= 2) return n;
        int[] res = new int[n];
        res[0] = 1;
        res[1] = 2;
        for(int i = 3; i <= n; i++) {
            res[i-1] = res[i-1-1] + res[i-2-1];
        }
        return res[n-1];
    }

    public static int climbStairs(int n) {
        int[] a = new int[n + 1];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i <= n; ++i) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n];
    }

}

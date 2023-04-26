package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {

	public static void main(String[] args) {
		String t = "01010";
		int a = 3;
		System.out.println(getGrayCode(t));
		System.out.println(getGrayCodeBitwise(t));
		
	}
	
	// Ming
	public static String getGrayCode(String code) {
		String res = code.substring(0, 1);
		String temp;
		
		for(int i = 0 ; i < code.length()-1 ; i++) {
			temp = String.valueOf((Integer.valueOf(code.charAt(i)) ^ Integer.valueOf(code.charAt(i + 1))));
			res += temp;
		}
		
		return res;
	}
	
	// Bitwise版
	public static String getGrayCodeBitwise(String code) {
		int res = Integer.valueOf(code);
		
		return String.valueOf(res) + ": " + String.valueOf(res >> 2);
	}
	
	// Ans網路版
	public static List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        if (n > 0) {
            int adder = 1;
            for (int i = 1; i <= n; i++) {
                int len = res.size();
                for (int j = len - 1; j >= 0; j--) {
                    res.add(res.get(j) + adder);
                }
                adder *= 2;
            }
        }
        return res;
    }
	
}

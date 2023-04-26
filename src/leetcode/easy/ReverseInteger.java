package leetcode.easy;

import java.util.ArrayList;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * @author 1091522
 *
 */

public class ReverseInteger {

	public static void main(String[] args) {
		int input1 = -10;
		int input2 = 10;
		System.out.println(ming(input1));
		System.out.println(ming(input2));
	}
	
	public static int ming(int input) {
		String temp = "";
		
		StringBuilder str = new StringBuilder(String.valueOf(Math.abs(input)));			
					
		if(input < 0) {
			temp = "-" + str.reverse();
		}else {
			temp = ""  + str.reverse();
		}
		
		return Integer.valueOf(temp);
	}
	
	

}

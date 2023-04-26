package leetcode.easy;

public class PalindromeNumber {

	public static void main(String[] args) {
		int a = 12321;
		int b = 123456;
		int c = -12321;
		
		System.out.println(ming(a));
		System.out.println(ming(b));
		System.out.println(ming(c));
		
	}
	
	public static boolean ming(int input) {
		boolean res = false;
		
		StringBuilder str = new StringBuilder(String.valueOf(input));
		
		if(String.valueOf(str).equals(String.valueOf(str.reverse()))) res = true;
		
		return res;
	}
}

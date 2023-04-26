package leetcode.easy;

public class RomanToInteger {

	public static void main(String[] args) {
		String a = "IX"; // 1994
		
		int res = ming(a);
		
		System.out.println(res);
		
	}
	
	public static int ming(String s) {
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(i+1 < s.length()) {
				if( getInt(s.charAt(i)) < getInt(s.charAt(i+1)) ) {
					System.out.println("-"+i+":"+s.charAt(i));
					sum -= getInt(s.charAt(i));
				}else {
					System.out.println("+"+i+":"+s.charAt(i));
					sum += getInt(s.charAt(i));
				}
			}			
		}
		
		sum = sum + getInt(s.charAt(s.length()-1));
		
		return sum;
	}
	
	public static int getInt(char roman) {
		int res;
		switch (roman) {
			case 'I': res = 1;   break;
			case 'V': res = 5;   break;
			case 'X': res = 10;  break;
			case 'L': res = 50;  break;
			case 'C': res = 100; break;
			case 'D': res = 500; break;
			case 'M': res = 1000;break;
			
			default: res = 0;break;
		}
		
		return res;
	}
}

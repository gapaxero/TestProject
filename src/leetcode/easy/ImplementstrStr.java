package leetcode.easy;

public class ImplementstrStr {

	public static void main(String[] args) {
		String str = "abc";
		String Str = "c";
		System.out.println(str.length());
		System.out.println(ming(str, Str));

	}
	
	public static int ming(String str,String Str) {
		int res = 0;
				
		for(int i = 0 ; i < str.length() ; i++) {
			System.out.println("i: " + i);
			for(int j = i+1 ; j < str.length()+1 ; j++) {
				System.out.println("j: " + j);
				if(str.substring(i, j).equals(Str)) {
					System.out.println(str.substring(i, j));
					return i; 
					
				}else {
					res = -1;
				}
				
			}
		}
		
		return res;
	}

}

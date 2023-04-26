package leetcode.easy;

public class LengthofLastWord {

	public static void main(String[] args) {
		String  s = "   fly me   to   the moon  a";
		
		System.out.println(getlen(s));
		
	}
	
	public static int getlen(String input) {
		int res = 0;
		
		String[] list = input.split(" ");
		
		res = list[list.length-1].length(); 
		
		return res;
	}

}

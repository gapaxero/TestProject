package leetcode.easy;

public class SingleNumber {

	public static void main(String[] args) {
		int[] a = {1,2,2,3,3};
		int res = 0;
		
		for(int i : a) res ^= i;
		
		System.out.println(res);
	}

}

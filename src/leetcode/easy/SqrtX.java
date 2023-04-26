package leetcode.easy;

public class SqrtX {

	public static void main(String[] args) {
		int input = 4;
		
		System.out.println(ming(input));
	}
	
	public static int ming(int input) {
		long low = 0,hight = (input/2)+1;
				
		while(hight >= low) {
			long mid = (low+hight)/2;
			if(mid * mid > input) {
				hight =  mid - 1;
			}else if (mid * mid < input) {
				low =  mid + 1;
			}else if (mid * mid == input) {
				return (int)mid;
			}
		}
		
		return (int)hight;
	}

}

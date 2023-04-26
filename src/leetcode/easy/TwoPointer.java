package leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;

public class TwoPointer {

	public static void main(String[] args) {
		int[] list = {1, 0, 5, 2, 6, 4};
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i : list) list2.add(i);
		Collections.sort(list2); // {0, 1, 2, 4, 5, 6}
		int[] res = new int[2];
		int target = 9,sum = 0;
		int a = 0;
		int b = list2.size()-1;
		
		while (true) {			
			sum = list2.get(a) + list2.get(b);
			if(sum > target) {
				b--;
			}else if(sum < target) {
				a++;
			}else if(sum == target) {
				res[0] = a; res[1] = b;
				break;
			}
		}			
		
		for(int i : res) {
			System.out.println(i);
		}
	}

}

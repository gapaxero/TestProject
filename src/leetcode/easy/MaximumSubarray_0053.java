package leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumSubarray_0053 {

	public static void main(String[] args) {
		int[] list = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//		List<Integer> reslist = ming(list).stream()
//										  .distinct()
//										  .collect(Collectors.toList());
//		int num = reslist.stream()
//				         .max(Integer::compare)
//				         .get();
		
		System.out.println(ming(list));
		
	}
	
	public static int ming(int[] list){
		int res = 0;
		List<Integer> reslist = new ArrayList<Integer>();
		for (int i = 0; i < list.length ; i++) {
			int sum = list[i];
			for (int j = i + 1; j < list.length ; j++) {	
				sum += list [j];
				reslist.add(sum);				
			}
		}
		
		res = reslist.stream()
		         .max(Integer::compare)
		         .get();
		
		return res;
	}
	
	//{ -2, 1, -3, 4, -1, 2, 1, -5, 4 }
	public static int max(int[] list) {
		int res = 0,temp = 0;
		
		for(int i = 0 ; i < list.length ; i++) {
			for(int j = i ; j < list.length ; j++) {
				temp += list[j]; 
			}
		}
		
		return res;
	}
	
	
	
}

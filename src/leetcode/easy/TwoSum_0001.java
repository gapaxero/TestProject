package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


/**
 *
 *
 *
 */

public class TwoSum_0001 {

	public static void main(String[] args) {
		int[] list = {2,7,11,15};
		int target = 18;
		
		for(int i : twoSum(list, target)) {
			System.out.println(i);
		}
		
		for(int i : twosumMing(list, target)) {
			System.out.println(i);
		}
		
	}
	
	public static int[] twosumMing(int[] list,int target){		
		int[] reslist = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0 ; i<list.length ; i++) {
			if(map.containsKey(list[i])) {
				reslist[0] = map.get(list[i]);
				reslist[1] = i;
			}else {
				map.put(target - list[i], i);
			}			
		}
		return reslist;
	}
	
	// INT
	public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
//      {2,7,11,15}
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                int index = map.get(numbers[i]);
                result[0] = index;
                result[1] = i;
                return result;
            } else {
                map.put(target - numbers[i], i);
//                System.out.println("map.put"+String.valueOf(target) + "-" + String.valueOf(numbers[i]) + "," + i);
            }
//            System.out.println(map);
        }
        return result;
    }
	
	 public static int[] leetcode(int[] nums, int target) {
	        int sum;
			int[] reslist = new int[2];
			HashMap<Integer, String> map = new HashMap<>();
			for(int i=0 ; i<nums.length ; i++) {
				for(int j=0 ; j<nums.length ; j++) {
					if(i == j) continue;
					sum = nums[i] + nums[j];
					reslist[0] = i;
					reslist[1] = j;
				}
			}	
			return reslist;
	 } 

}

package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElement {

	public static void main(String[] args) {
		int[] q = {3,2,2,3};
		int[] a = {0,1,2,2,3,0,4,2};
		int val = 3;
		
		
//		System.out.println(ming(q, val));
//		System.out.println(ming(a, 2));
		System.out.println(removeElement(q, 3));
	}
	// leetcode 會怪怪的
	public static int ming(int[] list,int val){
		List<Integer> reslist = new ArrayList<Integer>();
		
		reslist = Arrays.stream(list).boxed().collect(Collectors.toList());		
		
		reslist = reslist.stream().filter(target -> !String.valueOf(val).equals(String.valueOf(target)))
							   .sorted()
				               .collect(Collectors.toList());	
		
		System.out.println("ming: "+reslist);
		
		return reslist.size();
	}
	
	public static int removeElement(int[] list, int val) {
		int res = 0,temp = 0;
		//{0,1,2,2,3,0,4,2}
		for(int i = 0 ; i < list.length ; i++) {
			if(list[i] != val) {
				list[temp] = list[i];
				temp++;
			}
		}
		
		
		return temp;
    }
	
	
	
	
	
}

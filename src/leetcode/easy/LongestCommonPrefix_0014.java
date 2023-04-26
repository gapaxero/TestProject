package leetcode.easy;

import java.util.HashMap;

public class LongestCommonPrefix_0014 {
	
	public static void main(String[] args) {
		String[] list  = {"c","acc","ccc"};
		String[] list2 = {"flower","flow","flight"};
		String res  = ming(list);
		String res2 = ming(list2);
		
		System.out.println(res);
		System.out.println(res2);
	}
	
	public static String ming(String[] strs) {
		if(strs.length == 0 || strs == null) return "";
		String pre = strs[0];
		String res = "";
		for(int i = 0 ; i < strs.length ; i++) {
			while(true) {
				if(strs[i].indexOf(pre) != 0) {
					//FIXME
					pre = pre.substring(0, pre.length() - 1); 					
				}else {
					res = pre;
					break;
				}
			}
		}
		
		return res;
	}
	
	//網路的解法
	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "AA";
		String pre = strs[0];
		int i = 1;
		while (i < strs.length) {
			while (strs[i].indexOf(pre) != 0)
				pre = pre.substring(0, pre.length() - 1);
			i++;
		}
		return pre;
	}
}

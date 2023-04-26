package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.sound.midi.Track;

public class ThreeSUM_0015 {

	public static void main(String[] args) {
		int[] list = {1, 0, 5, 2, 6, 4};
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<int[]> listres = new ArrayList<int[]>();
		for(int i : list) list2.add(i);
		Collections.sort(list2); // sort:{0, 1, 2, 4, 5, 6}
		int[] res = new int[3];
		int target = 9,sum = 0;
		int a=0, b=0, c=0;
		
		for (int i = 0; i < list2.size(); i++) {
			a = i; // a:起始數字
			b = i + 1; // b:a+1位數字
			c = list2.size()-1;	// c:最後一位的數字	
			
			if(b >= c || b <= a)continue;
			
			
			while(true) {
				sum = list2.get(a) + list2.get(b) + list2.get(c);
				if(b == c) {
					break;
				}else {
//					System.out.println("a="  + a + "(" + list2.get(a) + ")"
//							         + ",b=" + b + "(" + list2.get(b) + ")"
//							         + ",c=" + c + "(" + list2.get(c) + ")"
//							         + ",sum=" + sum);
					if(sum < target) {
						b++;
					}else if(sum > target) {
						c--;
					}else if(sum == target) {
						res[0] = a; res[1] = b; res[2] = c;
						System.out.println("ans:" + a + "," + b + "," + c);
						break;
					}
				}
				
			}
			
		}					
		
		for(int[] i : listres) {
			for(int j : i) {
				System.out.println(j);
			}
		}
	}
	
	
	// solution
	public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>(); 
        for (int i = 0; i < nums.length-2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int j = i + 1, k = nums.length - 1, target = 0 - nums[i];
                while (j < k) {
                    if (nums[j] + nums[k] == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j < k && nums[j] == nums[j + 1]) j++;
                        while (j < k && nums[k] == nums[k - 1]) k--;
                        j++; k--;
                    } else if (nums[j] + nums[k] < target) ++j;
                    else --k;
                }
            }
        }
        return res;
    }

}

package leetcode.easy;

import java.util.Arrays;

public class SearchInsertPosition_0035 {
	
	public static void main(String[] args) {
		int[] list = {1, 3, 5, 6};
		int target = 7,res = 0;
		
//		res = Math.abs(Arrays.binarySearch(list, target));
		res = ming(list, target);
		System.out.println(res);
	}
	
	//GOD
	public static int binarySearch0(int[] a, int fromIndex, int toIndex, int key) {
		int low = fromIndex;
		int high = toIndex - 1;

		while (low <= high) {
			int mid = (low + high) >>> 1;
			int midVal = a[mid];

			if (midVal < key)
				low = mid + 1;
			else if (midVal > key)
				high = mid - 1;
			else
				return mid; // key found
		}
		return -(low + 1); // key not found.
	}

	//Ming
	public static int ming(int[] list,int target) {
		int first = 0,last = list.length-1;		
				
		while(first <= last) {
			int mid = (first + last)/2;
			
			if(list[mid] == target) {				
				return mid;
			}else if(list[mid] > target) {				
				last = mid-1;
			}else if(list[mid] < target) {
				first = mid+1;
			}
				
		}		
		
		return first;
		
	}
	
	
	// 網路的解法
	public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0, j = nums.length-1;
        int index = -1;
        while(i <= j) {
            index = (i + j) / 2;
            if(nums[index] == target)
                return index;
            if(nums[index] >= target)
                j = index - 1;
            else
                i = index + 1;
        }
        return i;
    }
}

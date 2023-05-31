package leetcode.easy;


import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order
 * , and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged
 * , and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        int m = 1, n = 1;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // init start index
        int i = m - 1, k = n - 1, j = m + n - 1;

        if(m == 0) {
            nums1[m] = nums2[k];
        } else {
            while ( i >= 0 && k >= 0 ) {
                if (nums1[i] > nums2[k]) {
                    nums1[j] = nums1[i];
                    i--;
                    j--;
                } else if (nums2[k] > nums1[i]) {
                    nums1[j] = nums2[k];
                    k--;
                    j--;
                } else { // else if (nums1[i] == nums1[k]) is redundant
                    nums1[j] = nums1[i];
                    i--;
                    j--;
                    nums1[j] = nums2[k];
                    k--;
                    j--;
                }
            }
        }
    }

}

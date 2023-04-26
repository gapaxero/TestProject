package leetcode.easy;

public class MergeTwoSortedLists0021 {

	public static void main(String[] args) {
		int[] list1 = {1, 3, 5, 8, 10};
		int[] list2 = {2, 4, 4};
		
		
		
	}
	
	/* 迭代
	 * 不斷的比較大小
	 * if(l1>12) 把l1.next=l1.next跟l2再比一次的結果
	 * if(l2>11) 把l2.next=l2.next跟l1再比一次的結果
	 * 
	 * */
	public static ListNode21 ming(ListNode21 l1, ListNode21 l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		if(l1.val < l2.val) {
			l1.next = ming(l1.next,l2);
			return l1;
		}else {
			l2.next = ming(l1,l2.next);
			return l2;
		}
		
		
	}

}

class ListNode21 {
	int val;
	ListNode21 next;

	ListNode21() {}
	
	ListNode21(int val) {
		this.val = val;
	}

	ListNode21(int val, ListNode21 next) {
		this.val = val;
		this.next = next;
	}
}

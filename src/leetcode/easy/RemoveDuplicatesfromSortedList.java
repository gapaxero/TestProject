package leetcode.easy;

import java.awt.event.ItemListener;
import java.time.temporal.Temporal;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicatesfromSortedList {

	public static void main(String[] args) {
		ListNode head = new ListNode();


		

	}
	
	public static ListNode ming(ListNode head) {
		ListNode ite = head;

		while (ite != null) {
			ListNode temp = ite.next;
			while(temp!= null && ite.val == temp.val) {
				temp = temp.next;
			}
			ite.next = temp;
			ite = temp;
		}

		return head;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
		
}
	

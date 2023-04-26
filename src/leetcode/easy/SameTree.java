package leetcode.easy;

public class SameTree {

	public static void main(String[] args) {
		int[] treeA = {1,1,2};
		int[] treeB = {1,3,2};
		
		
		
	}
	
	/*
	 * p and q = null | true
	 * p or  q = null | false
	 * 
	  *  反覆執行上面的判斷(遞迴) root -> left -> right
	 * */
	public static boolean isSameTree(TreeNode p,TreeNode q) {
		
		if( (p == null) && (q == null) ) return true;
		if( (p == null) || (q == null) ) return false;
		
		return (p.val == q.val) && ( isSameTree(p.right, p.right) && isSameTree(p.right, q.right) );
		
	}
	
	// LeetCode官方定義
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}

}

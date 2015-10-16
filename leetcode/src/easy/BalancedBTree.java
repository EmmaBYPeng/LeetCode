package easy;

import util.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BalancedBTree {
	public boolean isBalanced2 (TreeNode root) {
		return (dfsDepth(root) != -1);
	}
	
	// Will cause stack overflow
	public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        
        int dLeft = depth(root.left);
        int dRight = depth(root.right);
        if (dLeft - dRight > 1 || dLeft - dRight < -1) {
        	return false;
        } else {
        	return isBalanced(root.left) && isBalanced(root.right);
        }
    }
	
	public int depth(TreeNode root) {
		if (root == null) return 0;
		
		int dLeft = depth(root.left);
		int dRight = depth(root.right);
		
		int tDepth = (dLeft > dRight) ? (dLeft + 1) : (dRight + 1);
		return tDepth;
	}
	
	public int dfsDepth(TreeNode root) {
		if (root == null) return 0;
		
		int dLeft = dfsDepth(root.left);
		if (dLeft == -1) return -1;
		
		int dRight = dfsDepth(root.right);
		if (dRight == -1) return -1;
		
		if (Math.abs(dLeft - dRight) > 1) return -1;
		return (Math.max(dLeft, dRight)) + 1;
	}
}

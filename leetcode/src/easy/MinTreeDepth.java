package easy;

import util.TreeNode;

public class MinTreeDepth {

	public int minDepth(TreeNode root) {
		if (root == null) return 0;
		
		int dleft = minDepth(root.left);
		int dright = minDepth(root.right);
		
		if (root.left == null) return 1 + dright;
		if (root.right == null) return 1 + dleft;
		
		return Math.min(dright+1, dleft+1);
    }
}

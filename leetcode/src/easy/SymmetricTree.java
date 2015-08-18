package easy;

import util.TreeNode;

public class SymmetricTree {

	public boolean isSymmetric(TreeNode root) {
		if (root == null) return true;
		return symmetricNodes(root.left, root.right);
    }
	
	public boolean symmetricNodes(TreeNode left, TreeNode right) {
		if (left == null || right == null) return left == right;
		if (left.val != right.val) return false;
		return symmetricNodes(left.left, right.right) && symmetricNodes(left.right, right.left);
	}
}

package easy;

public class SymmetricTree {

	public boolean isSymmetric(TreeNode root) {
		if (root == null) return true;
		if (root.left == null && root.right == null) return true;
		if (root.left == null) return false;
		if (root.right == null) return false;
		
		return isSymmetric(root.left) && isSymmetric(root.right);
    }
}

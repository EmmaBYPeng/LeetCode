package easy;

public class PathSum {

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) return false;
		
		if (root.val == sum && root.right == null && root.left == null) {
			return true;
		} else {
			return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
		}
    }
}

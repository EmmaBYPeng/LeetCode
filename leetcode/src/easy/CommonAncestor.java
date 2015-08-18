package easy;

import util.TreeNode;

public class CommonAncestor {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    
		if (root == null) return null;
		
		if (p == null) return q;
		
		if (q == null) return p;
		
		if ((p.val <= root.val && q.val >= root.val) || (q.val <= root.val && p.val >= root.val)) {
			return root;
		} else if (p.val <= root.val && q.val <= root.val) {
			return lowestCommonAncestor(root.left, p, q);
		} else {
			return lowestCommonAncestor(root.right, p, q);
		}
    }
}

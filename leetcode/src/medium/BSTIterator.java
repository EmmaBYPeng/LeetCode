package medium;

import util.TreeNode;
import java.util.Stack;

public class BSTIterator {
	Stack<TreeNode> stack = new Stack<TreeNode>();

    public BSTIterator(TreeNode root) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return (!stack.isEmpty());
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode next = stack.pop();
        TreeNode temp = next.right;
        while (temp != null) {
            stack.push(temp);
            temp = temp.left;
        }
        
        return next.val;
    }
}

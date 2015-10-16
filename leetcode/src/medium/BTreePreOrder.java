package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import util.TreeNode;

public class BTreePreOrder {
	public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        
        if (root != null) stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode next = stack.pop();
            list.add(next.val);
            if (next.right != null) stack.push(next.right);
            if (next.left != null) stack.push(next.left);
        }
        
        return list;
    }

}

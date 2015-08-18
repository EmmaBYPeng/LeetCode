package easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import util.TreeNode;

public class BTreeLevelOrderBottom {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Stack<List<Integer>> stack = new Stack<List<Integer>>();
		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		
		if (root == null) return list;
		
		queue.add(root);
		while (!queue.isEmpty()) {
			List<Integer> elem = new ArrayList<Integer>();
			int size = queue.size();
			
			for (int i = 0; i < size; i++) {
				TreeNode current = queue.poll();		
				if (current.left != null) queue.add(current.left);
				if (current.right != null)  queue.add(current.right);
				elem.add(current.val);
			}
			stack.add(elem);
		}
		
		// From bottom
		int num = stack.size();
		for (int i = 0; i < num; i++) {
			List<Integer> elem = stack.pop();
			list.add(elem);
		}
		return list;
    }
}

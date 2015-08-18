package easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import util.TreeNode;

public class BTreeLevelOrder {

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
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
			list.add(elem);
		}
		
		return list;
    }
}

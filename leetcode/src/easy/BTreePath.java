package easy;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

public class BTreePath {

	public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        
        if (root == null) return list;
        if (root.left == null && root.right == null) {
        	list.add(Integer.toString(root.val));
        	return list;
        }
        
        String prefix = Integer.toString(root.val) + "->";
        List<String> leftList = binaryTreePaths(root.left);
        List<String> rightList = binaryTreePaths(root.right);
        
        if (!leftList.isEmpty()) {
        	for (String path: leftList) {
        		list.add(prefix + path);
        	}
        }
        
        if (!rightList.isEmpty()) {
        	for (String path: rightList) {
        		list.add(prefix + path);
        	}
        }
        
        return list;
    }
}

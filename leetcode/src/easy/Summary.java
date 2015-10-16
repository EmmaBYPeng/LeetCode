package easy;

import java.util.ArrayList;
import java.util.List;


public class Summary {

	public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        
		if (nums == null || nums.length == 0) return list;
		if (nums.length == 1) {
			list.add(nums[0] + "");
			return list;
		}
		
		int start = nums[0];
		int end = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i-1] + 1) {
				end = nums[i];
			} else {
				if (end > start) {
					list.add(start + "->" + end);
				} else {
					list.add(start + "");
				}
				start = nums[i];
				end = nums[i];
			}
		}
		
		if (end > start) {
			list.add(start + "->" + end);
		} else {
			list.add(start + "");
		}
		
		return list;
    }
}

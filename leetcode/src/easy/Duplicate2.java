package easy;

import java.util.HashMap;
import java.util.Map;

public class Duplicate2 {

	// Time limit exceeded
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if (nums == null) return false;
		for (int i = 0; i < nums.length-1; i++) {
			if (i+k < nums.length) {
				for (int j = i+1; j <= i+k; j++) {
					if (nums[i] == nums[j]) return true;
				}
			} else {
				for (int j = i+1; j < nums.length; j++) {
					if (nums[i] == nums[j]) return true;
				}
			}
		}
		return false;
    }
	
	public boolean containsNearbyDuplicate2(int[] nums, int k) {
		if (nums == null) return false;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				if (i-map.get(nums[i]) <= k) {
					return true;
				} else {
					map.replace(nums[i], i);
				}
			} else {
				map.put(nums[i], i);
			}
		}
		
		return false;
	}
	
	public boolean containsNearbyDuplicate3(int[] nums, int k) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	    for(int i = 0; i <  nums.length; i++) {
	        Integer ord = map.put(nums[i], i);
	        if(ord != null && i - ord <= k) {
	            return true;
	        }
	    }

	    return false;
	}
}

package easy;

import java.util.Arrays;
 
public class Duplicate {
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		
		if (nums.length <= 1) return false;
		
		int temp = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == temp) return true;
			temp = nums[i];
		}
		
		return false;
    }
}

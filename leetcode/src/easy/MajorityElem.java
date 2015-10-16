package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElem {

	public int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else {
				map.replace(nums[i], map.get(nums[i])+1);
			}
		}
		
		int max = -1;
		int index = -1;
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				index = entry.getKey();
			}
		}
		
		return index;
    }
	
	public int majorityElement2(int[] nums) {
		Arrays.sort(nums);
		int mid = nums.length/2;
		return nums[mid];
	}

	public int majorityElement3(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
    }
}

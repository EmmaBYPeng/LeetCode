package easy;

public class RotateArray {

	public void rotate(int[] nums, int k) {
		if (nums == null) return;
		int len = nums.length;
		if (len == 0) return;
		
		k %= len;
		
		int[] rot = new int[len];
		for (int i = 0; i < k; i++) {
			rot[i] = nums[len-k+i];
		}
		for (int i = 0; i < len-k; i++) {
			rot[k+i] = nums[i];
		}
		for (int i = 0; i < len; i++) {
			nums[i] = rot[i];
		}
    }
	
	public void rotate2(int[] nums, int k) {
		if (nums == null) return;
		int len = nums.length;
		if (len <= 1) return;
		
		k %= len;
		
		reverse(nums, 0, len-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, len-1);
	}
	
	public void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}

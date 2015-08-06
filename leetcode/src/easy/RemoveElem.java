package easy;

public class RemoveElem {

	 public int removeElement(int[] nums, int val) {

		 int k = 0;
		 for (int i = 0; i < nums.length; i++) {
			 if (nums[i] == val) {
				 nums[k] = nums[i];
				 k++;
			 }
		 }
		 
		 return k;
		 
	 }
	 
	 public int removeDuplicates(int[] nums) {
		 int len = nums.length;
		 if (len <= 1) return len;
		 
		 int k = 0;
		 for (int i = 1; i < len; i++) {
			 while (i < len && nums[i] == nums[k]) {
				 i++;
			 }
			 if (i < len) {
				 nums[++k] = nums[i];
			 }
		 }
		 
		 return k+1;
	 }
}

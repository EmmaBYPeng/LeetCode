package easy;

public class HouseRobber {

	// Dynamic programming
	public int rob(int[] nums) {
		int[][] dp = new int[nums.length+1][2];
		
		for (int i = 1; i <= nums.length; i++) {
			dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
			dp[i][1] = nums[i-1] + dp[i-1][0]; 
		}
		
		return Math.max(dp[nums.length][0], dp[nums.length][1]);
    }
	
	public int rob2(int[] nums) {
		int[] dp = new int[nums.length];
		if (nums.length == 0) return 0;
		if (nums.length == 1) return nums[0];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		if (nums.length == 2) return dp[1];
		
		for (int i = 1; i < nums.length; i++) {
			dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
		}
		
		return dp[nums.length-1];
	}
}

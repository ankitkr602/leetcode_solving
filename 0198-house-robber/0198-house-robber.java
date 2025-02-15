class Solution {
    public int maxmoney(int[] nums, int i, int[] dp){
        if(i < 0)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
        return dp[i] = Math.max(nums[i]+maxmoney(nums, i-2, dp), maxmoney(nums, i-1, dp));

    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        maxmoney(nums, nums.length-1, dp);
        return dp[nums.length-1];
    }
}
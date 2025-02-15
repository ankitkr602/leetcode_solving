class Solution {
      public int maxmoney(int[] nums, int i, int[] dp){
        if(i < 0)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
        return dp[i] = Math.max(nums[i]+maxmoney(nums, i-2, dp), maxmoney(nums, i-1, dp));

    }
    public int rob(int[] nums) {
        if(nums.length == 0)
        return 0;
        if(nums.length == 1)
        return nums[0];
        int[] dp1 = new int[nums.length-1];
        int[] dp2 = new int[nums.length-1];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        int newArray[] = new int[nums.length -1];
        for(int i=1;i<nums.length;i++){
            newArray[i-1] = nums[i];
        }
        maxmoney(nums, nums.length-2, dp1);
        maxmoney(newArray, newArray.length-1,dp2);
        return Math.max(dp1[nums.length-2],dp2[nums.length-2]);
    }
}
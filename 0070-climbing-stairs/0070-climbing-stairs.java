class Solution {
    int climbingstairs(int n, int dp[]){
       if(dp[n]!=-1)
       return dp[n];
       return dp[n] = climbingstairs(n-1,dp)+climbingstairs(n-2,dp); 
    }
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        dp[1] = 1;
        return climbingstairs(n, dp);

        
    }
}
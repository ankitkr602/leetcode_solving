class Solution {
    int climbingstairs(int n, int dp[]){
       if(n<0)
       return 0;
       if(dp[n]!=-1)
       return dp[n];
       return dp[n] = climbingstairs(n-1,dp)+climbingstairs(n-2,dp); 
    }
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        return climbingstairs(n, dp);

        
    }
}
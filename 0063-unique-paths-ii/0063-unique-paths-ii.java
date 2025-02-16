class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int dp[][]= new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int[] r : dp)
            Arrays.fill(r, -1);
        int count =0;
        for(int i = 0 ;i<obstacleGrid.length; i++){
            if(obstacleGrid[i][0] == 1)
            count++;
            if(count > 0)
            dp[i][0] = 0;
            else 
            dp[i][0] = 1;
        }
        count =0;
        for(int i =0 ;i<obstacleGrid[0].length; i++){
            if(obstacleGrid[0][i] == 1)
            count++;
            if(count > 0)
            dp[0][i] = 0;
            else 
            dp[0][i] =1;
        }
        for(int i=1;i<obstacleGrid.length;i++){
            for(int j =1;j<obstacleGrid[0].length; j++){
                if(obstacleGrid[i][j] !=1){
                    if(obstacleGrid[i-1][j] != 1 && obstacleGrid[i][j-1]!=1)
                    dp[i][j] = dp[i][j-1]+dp[i-1][j];
                    else if(obstacleGrid[i-1][j]==1)
                    dp[i][j] = dp[i][j-1];
                    else if(obstacleGrid[i][j-1]==1)
                    dp[i][j] = dp[i-1][j];
                }
                else 
                    dp[i][j] = 0;
            }
        }
        if( obstacleGrid[obstacleGrid.length -1][obstacleGrid[0].length -1] != 1)
        return dp[obstacleGrid.length -1][obstacleGrid[0].length -1];
        return 0;
    }
}
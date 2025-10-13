class Solution {
    public int maxProfit(int[] prices) {
        int buy = 1, cap =2;
        int currresult[][] = new int[buy+1][cap+1];
        int result[][] = new int[buy+1][cap+1]; 
        
        for(int []oneD: result)
        Arrays.fill(oneD, 0);

        for(int i = prices.length -1 ; i>=0; i--){
            for(buy = 0; buy <=1 ; buy++){
                for(cap = 1; cap<=2; cap++){
                    if(buy == 1 ){
                        currresult[buy][cap] = Math.max(-prices[i]+ result[0][cap], 0+result[1][cap]);
                    }
                    else{
                        currresult[buy][cap] = Math.max(prices[i]+ result[1][cap-1], 0+result[0][cap]);
                    }
                }
            }
            result = currresult;
        }
        return result[1][2];
    }
}
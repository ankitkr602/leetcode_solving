class Solution {
    public int maxProfit(int[] prices) {
        int buy = 1, cap =2;
        int result[][][] = new int[prices.length +1][buy+1][cap+1];
        for(int [][]twoD: result)
        for(int []oneD: twoD)
        Arrays.fill(oneD, 0);

        for(int i = prices.length -1 ; i>=0; i--){
            for(buy = 0; buy <=1 ; buy++){
                for(cap = 1; cap<=2; cap++){
                    if(buy == 1 ){
                        result[i][buy][cap] = Math.max(-prices[i]+ result[i+1][0][cap], 0+result[i+1][1][cap]);
                    }
                    else{
                        result[i][buy][cap] = Math.max(prices[i]+ result[i+1][1][cap-1], 0+result[i+1][0][cap]);
                    }
                }
            }
        }
        return result[0][1][2];
    }
}
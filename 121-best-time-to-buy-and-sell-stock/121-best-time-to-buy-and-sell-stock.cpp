class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int minday=prices[0];
        int profit=0;
        for(int i=0;i<prices.size();i++)
        {
            if(profit<prices[i]-minday)
                profit=prices[i]-minday;
            else if(prices[i]-minday<0)
                minday=prices[i];
        }
        return profit;
    }
};
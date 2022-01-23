class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int minday=prices[0];
        int maxProfit=0;
        for(int i=0;i<prices.size();i++)
        {
            minday=min(minday,prices[i]);
            maxProfit=max(maxProfit,prices[i]-minday);
        }
        return maxProfit;
    }
};
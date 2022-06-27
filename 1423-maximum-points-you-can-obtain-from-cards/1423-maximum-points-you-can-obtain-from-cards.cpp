class Solution {
public:
    int maxScore(vector<int>& nums, int k) {
       int maxsum=0,n=nums.size();int mini;
        for(int i=0;i<n-k;i++)
            maxsum+=nums[i];
        mini=maxsum;
        for(int i=n-k;i<nums.size();i++)
        {
            maxsum=(nums[i]+maxsum-nums[i-n+k]);
            mini=min(mini,maxsum);
            
        }
        int sum=0;
        for(int i=0;i<nums.size();i++){
         sum+=nums[i];
    }
        return sum-mini;
    }
        
};
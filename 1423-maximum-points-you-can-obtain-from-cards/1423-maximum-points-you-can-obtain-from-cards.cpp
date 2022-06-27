class Solution {
public:
    int maxScore(vector<int>& nums, int k) {
       int maxsum=0,maxi=0;
        for(int i=0;i<nums.size();i++)
        {
            maxsum+=nums[i];
            nums[i]=maxsum;
        }
        if(k==nums.size())
            return maxsum;
        maxi=maxsum-nums[nums.size()-k-1];
        for(int i=0;i<k;i++)
        {
            maxi=max(maxi,maxsum-nums[nums.size()-k+i]+nums[i]);
        }
        return maxi;
    }
        
};
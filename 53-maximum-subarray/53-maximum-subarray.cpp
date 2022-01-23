class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int currentsum=0,maxsum=nums[0];
        for(int i=0;i<nums.size();i++)
        {
            currentsum +=nums[i];
            if(currentsum<nums[i])
                currentsum=nums[i];
            if(currentsum>maxsum)
                maxsum=currentsum;
        }
       return maxsum; 
    }
};
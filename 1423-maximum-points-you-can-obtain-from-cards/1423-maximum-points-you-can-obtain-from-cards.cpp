class Solution {
public:
    int maxScore(vector<int>& nums, int k) {
        int i=0,j=nums.size()-1;
        int maxi=0;
        vector<int>frontsum;
        vector<int>endsum;
        int maxsum=0,maxsum1=0;
        while(i<k)
        {
            maxsum+=(nums[i++]);
            maxsum1+=nums[j--];
            frontsum.push_back(maxsum);
            endsum.push_back(maxsum1);
        }
        maxi=max(maxsum,maxsum1);
        for(int p=1;p<k;p++)
        {
            maxi=max(maxi,frontsum[p-1]+endsum[k-1-p]);
        }
        return  maxi;
    }
};
class Solution {
public:
    int maxScore(vector<int>& nums, int k) {
        int i=0,j=0;
        int maxi=0;
        vector<int>frontsum;
        vector<int>endsum;
        int maxsum=0,maxsum1=0;
        while(i<k)
        {
            maxsum+=(nums[i]);
            frontsum.push_back(maxsum);
            i++;
        }
        while(j<k)
        {
            maxsum1+=(nums[nums.size()-1-j]);
            endsum.push_back(maxsum1);
            j++;
        }
        maxi=max(maxsum,maxsum1);
        for(int p=1;p<k;p++)
        {
            maxi=max(maxi,frontsum[p-1]+endsum[k-1-p]);
        }
        return  maxi;
    }
};
class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int immediate_next_at=-1;
        int val;
        for(int i=nums.size()-2;i>=0;i--)
        {
            for(int j=i+1;j<nums.size();j++)
            {
                if(nums[i]<nums[j])
                {
                    immediate_next_at=j;
                }
            }
            if(immediate_next_at!=-1)
            {
                swap(nums[i],nums[immediate_next_at]);
                val=i+1;
                break;
            }
        }
        cout<<val;
        
        if(immediate_next_at==-1){
            sort(nums.begin(),nums.end());
            return;
        }
        int len=nums.size()-val;
        for(int k=0;k<len-1;k++)
        {
            for(int j=0;j<len-1-k;j++)
            {
                if(nums[j+val]>nums[j+1+val])
                    swap(nums[j+val],nums[j+1+val]);
            }
        }
        for(int i=0;i<nums.size();i++)
            cout<<nums[i];
    }
};
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
    if(nums.size()>0){
       // int distinctNum=nums[0];
        int count=1,k=0;
       
        for(int i=1;i<nums.size();i++)
        {
            if(nums[k]!=nums[i])
            {
                nums[k+1]=nums[i];
                count++;
                k++;
            }
        }
        return count;
    }
        else return 0;
        
    }
};
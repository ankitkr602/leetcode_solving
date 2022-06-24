class Solution {
public:
    void sortColors(vector<int>& nums) {
        int low=0,mid=0,high=nums.size()-1;
      for(int i=0;i<=high;i++)
      {
          if(nums[i]==0)
          {
              swap(nums[i],nums[low++]);
          }
          else if(nums[i]==2)
          {
              swap(nums[i--],nums[high--]);
          }
      }
    }
};
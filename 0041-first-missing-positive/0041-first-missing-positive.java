class Solution {
    public int firstMissingPositive(int[] nums) {
        int first_no =0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0)
            continue;
            else{
                if(first_no == 0)
                    first_no = nums[i];
                if(first_no > 1)
                return 1;
                if(i+1<nums.length && nums[i+1]-nums[i]>1)
                return nums[i]+1;



            }

        }
        if(first_no ==0)
        return 1;
        return nums[nums.length - 1]+1;
        
    }
}
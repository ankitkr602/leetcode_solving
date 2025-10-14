class Solution {
    public int trap(int[] height) {
        int left =0, right = height.length -1,leftmax =0, rightmax =0, water =0;
        while(left < right){
            leftmax = Math.max(leftmax, height[left]);
            rightmax = Math.max(rightmax, height[right]);
            if(leftmax <= rightmax){
                water += leftmax - height[left];
                left++;
            }
            else{
                water += rightmax- height[right];
                right--;
            }
        }
        return water;
    }
}
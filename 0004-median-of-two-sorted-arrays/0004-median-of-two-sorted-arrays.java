class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        else{
        int m = nums1.length;
        int n = nums2.length;
        int left = 0;
        int right = m;
        int totalelement = (m+n+1)/2;
        while(left <= right){
            int Px = left + (right - left)/2;
            int Py = totalelement - Px;
            int l1 = (Px == 0) ? Integer.MIN_VALUE : nums1[Px-1];
            int l2 = (Py == 0) ? Integer.MIN_VALUE : nums2[Py-1];
            int r1 = (Px == m) ? Integer.MAX_VALUE : nums1[Px];
            int r2 = (Py == n) ? Integer.MAX_VALUE : nums2[Py];
            
            if(l1<= r2 && l2<= r1){
                if((m+n)%2 == 0)
                {
                    return (Math.max(l1, l2) + Math.min(r1,r2))/2.0;
                }
                else 
                    return Math.max(l1,l2);
            }
            else if(l1 > r2){
                right = Px -1;
            }
            else{
                left = Px + 1;
            }
        }
      }
      return 0.0;
    }
}
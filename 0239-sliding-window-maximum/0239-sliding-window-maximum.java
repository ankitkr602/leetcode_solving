class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int result[] = new int[nums.length - k +1];
        Deque<Integer> dq = new LinkedList<>();
        for(int i = 0; i<nums.length;i++){
            while(!dq.isEmpty() && dq.peekFirst()<= i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()]< nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);

           if(i >= k-1)
            result[i-k+1]= nums[dq.peekFirst()];
        }
        return result;
    }
}
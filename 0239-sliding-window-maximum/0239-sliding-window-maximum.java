class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int result[] = new int[nums.length - k +1];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> nums[b]-nums[a]);
        for(int i = 0; i<k;i++){
            pq.add(i);
        }
        for(int i  = k; i<= nums.length; i++){
            result[i-k] = nums[pq.peek()];
            if(i< nums.length)
            pq.add(i);
            while(!pq.isEmpty() && pq.peek()<= i - k){
                pq.poll();
            }
        }
        return result;
    }
}
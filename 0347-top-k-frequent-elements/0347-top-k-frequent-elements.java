class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int n : nums){
            mp.put(n, mp.getOrDefault(n, 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> mp.get(a)- mp.get(b));
        for(int n : mp.keySet()){
            pq.add(n);
            if(pq.size()> k)
            pq.poll();
        }

        int []result = new int[k];
        int p =0;
        while(!pq.isEmpty()){
            result[p] = pq.poll();
            p++;
        }
        return result;
    }
}
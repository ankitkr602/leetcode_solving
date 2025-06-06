class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int i;
        for(i = 0; i < heights.length-1; i++){ 
            int diff = heights[i+1] - heights[i];
            if(diff <= 0)
            continue;

            if(bricks >= diff){
                    pq.add(diff);
                    bricks -= diff;
            }
            else if(ladders > 0){
                //case to use ladders
                    if(!pq.isEmpty()){
                        
                        if(pq.peek() > diff){
                        bricks += pq.peek();
                        pq.poll();
                        bricks -= diff;
                        pq.add(diff);
                        ladders--;
                        }
                        else {
                        ladders--;
                    }
                     }
                      else
                        ladders--;
               }
               else 
               break;
            }
        return i;
    }
}
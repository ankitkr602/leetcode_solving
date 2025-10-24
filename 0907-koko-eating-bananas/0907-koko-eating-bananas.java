class Solution {
    public boolean bananaEating(int[] piles, int k, int h){
        int time = 0;
        for(int pile :  piles){
            time += Math.ceil((double)pile/k);
        }
        if(time <= h)
        return true;
        return false;
        
    }
    public int minEatingSpeed(int[] piles, int h) {
        int mineating = Integer.MAX_VALUE;
        int maxi = piles[0];
        for(int pile : piles){
            maxi = Math.max(maxi, pile);
        }
        int left = 1;
        int right = maxi;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(bananaEating(piles,mid,h)){
                right = mid -1;
                mineating = Math.min(mid, mineating);
            }
            else{
                left = mid+1;
            }
        }
        return mineating;
    }
}
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boat =0;
        int left =0, right = people.length -1;
        while(left < right){
            if(people[left]+people[right]<= limit){
            boat++;
            left++;
            right--;
        }
        else if(people[left]+people[right] > limit){
            boat++;
            right--;
        }
    }
        if(left==right)
        return boat+1;
        else return boat;
    }
}
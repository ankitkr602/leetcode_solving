class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int maxLen = 0;
        int i=0,j =0;
        while(i < s.length()){
            if(!mp.containsKey(s.charAt(i)))
                mp.put(s.charAt(i), 1);
            else{
                while(s.charAt(i) != s.charAt(j)){
                    mp.remove(s.charAt(j));
                    j++;
                }
               j = j+1; 
            }
            maxLen = Math.max(maxLen, i -j+1);
            i++;
        }
        return maxLen;
    }
}
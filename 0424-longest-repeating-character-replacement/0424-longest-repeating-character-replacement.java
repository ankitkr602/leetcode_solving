class Solution {
    public int characterReplacement(String s, int k) {
        int left =0, right =0;
        int maxLen =0, len =0;
        int maxOccur = 0;
        int arr[] = new int[26];
        while(right < s.length()){
           arr[s.charAt(right)-'A']++;
           maxOccur = Math.max(maxOccur, arr[s.charAt(right)-'A']);
            len = right - left + 1;
            if(len - maxOccur <=k)
            maxLen = Math.max(len, maxLen);
            else{
            arr[s.charAt(left)-'A']--;
            left++;
            }
            right++;
        }
        return maxLen;
    }
}
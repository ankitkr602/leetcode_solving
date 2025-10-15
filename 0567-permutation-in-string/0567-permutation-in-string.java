class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> mp = new HashMap<>(s1.length());
        for(int i =0;i< s1.length();i++){
            mp.put(s1.charAt(i), mp.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for(int i =0; i<= s2.length() - s1.length(); i++)
            {
                HashMap<Character, Integer> mp1 = new HashMap<>(s1.length());
                for(int j =i; j< i+s1.length(); j++){
                     mp1.put(s2.charAt(j), mp1.getOrDefault(s2.charAt(j), 0) + 1);
                }
                if(mp1.equals(mp))
                return true;
            }
        return false;
    }
}
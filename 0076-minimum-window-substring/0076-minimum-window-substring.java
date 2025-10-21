class Solution {
    public String minWindow(String s, String t) {
        if(s.length() == 0 || t.length() == 0 || s.length() < t.length())
        return "";
        HashMap<Character, Integer> tmap = new HashMap<>();
        HashMap<Character, Integer> smap = new HashMap<>();
        int left =0, right = 0, ansleft = -1, ansright = -1, minLen = Integer.MAX_VALUE, unique = t.length(), create =0;
        for(int i =0;i< t.length(); i++){
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0)+1);
        }

        while(right < s.length())
        {
             smap.put(s.charAt(right), smap.getOrDefault(s.charAt(right), 0) +1);
            if(tmap.containsKey(s.charAt(right)))
            {
                if(smap.get(s.charAt(right)) <= tmap.get(s.charAt(right)))
                create++;
            }
                while(create == unique){
                    System.out.println("right entered"+ right);
                    smap.put(s.charAt(left), smap.get(s.charAt(left))-1);

                    if(tmap.containsKey(s.charAt(left)) && tmap.get(s.charAt(left)) > smap.get(s.charAt(left))){
                        create--;
                        System.out.println("create - " + create+ left);
                    }
                    if(minLen > right-left+1){
                        minLen = right-left+1;
                        ansleft = left;
                        ansright = right;
                    }
                    
                    left++;
                }
            right++;
        }
         System.out.println(ansleft);
        if(ansleft == -1)
        return "";
        return s.substring(ansleft, ansright+1);
    }
}
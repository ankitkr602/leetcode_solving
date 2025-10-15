class Solution {
    private boolean matches(int a1[], int a2[]){
        for(int i = 0 ;i< 26;i++){
            if(a1[i]!=a2[i])
            return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()> s2.length())
        return false;
        int arr[]= new int[26];
        int arr1[] = new int[26];
        for(int i =0;i< s1.length();i++){
           arr[s1.charAt(i)-'a']++;
           arr1[s2.charAt(i)-'a']++;
        }
        for(int i =0; i< s2.length() - s1.length(); i++)
            {
                if(matches(arr, arr1))
                return true;
                arr1[s2.charAt(i+s1.length())-'a']++;
                arr1[s2.charAt(i)-'a']--;
            }
        return matches(arr, arr1);
    }
}
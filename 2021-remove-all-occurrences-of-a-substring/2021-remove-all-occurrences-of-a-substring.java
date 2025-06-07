class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            result.append(s.charAt(i));
            if(result.length() >= part.length())
            {
                int idx = result.indexOf(part);
               if(idx !=-1 && result.substring(idx).equals(part)){
                result = result.delete(idx,result.length());
               }
            }
        }
        return result.toString();

    }
}
class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            result.append(s.charAt(i));
            if(result.length() >= part.length())
            {
               if(result.substring(result.length()-part.length()).equals(part)){
                result = result.delete(result.length() -part.length(),result.length());
               }
            }
        }
        return result.toString();

    }
}
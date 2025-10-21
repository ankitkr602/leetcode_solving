class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int closingcount =0;
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(c =='(' || c == '{' || c =='['){
                st.push(c);
            }
            else {
                if(c == ')'){
                    if(!st.isEmpty() && st.peek()== '('){
                    st.pop();
                    }
                    else
                    return false;
                }
                else if(c==']'){
                   
                    if(!st.isEmpty() && st.peek()== '['){
                    st.pop();
                 
                }
                    else
                    return false;
                }
                else if(c == '}'){
                    
                    if(!st.isEmpty() && st.peek()== '{'){
                    st.pop();
                   
                    }
                    else
                    return false;
                }
            }
        }
        if(st.size()> 0 || closingcount>0)
        return false;
        return true;
    }
}
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int var1, var2;
        for(int i =0;i< tokens.length;i++){

          if(tokens[i].equals("+"))
            {
                int sum =0;
                var1 = st.pop();
                var2 = st.pop();
                sum = var2+var1;
                st.push(sum);

            }
            else if(tokens[i].equals("-"))
            {
                int sub =0;
                var1 = st.pop();
                var2 = st.pop();
                sub = var2-var1;
                st.push(sub);

            }
            else  if(tokens[i].equals("*"))
            {
                int mul =1;
                var1 = st.pop();
                var2 = st.pop();
                mul = var2*var1;
                st.push(mul);

            }
            else if(tokens[i].equals("/"))
            {
                int div =0;
                var1 = st.pop();
                var2 = st.pop();
                if(var1 !=0)
                div = var2/var1;
                st.push(div);

            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}
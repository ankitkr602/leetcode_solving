class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int result[] = new int[temperatures.length];
        int top = temperatures.length-1 ;
        for(int i = temperatures.length -1; i>=0; i--){
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }
            if(st.isEmpty())
            st.push(i);
            result[i] = st.peek() - i;
            st.push(i);
    
        }
        return result;
    }
}
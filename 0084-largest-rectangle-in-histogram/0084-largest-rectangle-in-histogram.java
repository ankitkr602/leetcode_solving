class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea =0;
        
        for(int i =0;i< heights.length; i++){
            int temp = heights[i];
            while(!st.isEmpty() && heights[st.peek()]> temp){
                int height = heights[st.pop()];
                int pse = st.empty() ? -1: st.peek();
                int nse = i; 
                int width = nse - pse -1;
                maxArea = Math.max(maxArea,height * width);
            }
            st.push(i);
        }
            while(!st.empty()){
                int height = heights[st.pop()];
                int nse = heights.length;
                int pse = st.empty() ? -1 : st.peek();
                int width = nse -pse -1;
                maxArea = Math.max(maxArea, height*width);
            }
        return maxArea;
    }
}
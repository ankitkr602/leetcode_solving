class MinStack {
    
    class Node{
        int val;
        int min;
        Node(int val, int min){
            this.val =val;
            this.min = min;
        }
    }

    private List<Node> st;
    int mini;

    public MinStack() {
        st = new ArrayList<>();
        this.mini = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(st.size()== 0)
        st.add(new Node(val, val));
        else
        st.add(new Node(val, Math.min(val,st.get(st.size()-1).min)));
       
    }
    
    public void pop() {
        st.remove(st.size()-1);
        
    }
    
    public int top() {
       return st.get(st.size()-1).val;
    }
    
    public int getMin() {
        return st.get(st.size()-1).min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
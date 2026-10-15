class MinStack {
    
    private Deque<Integer> st;
    private Deque<Integer> minst;

    public MinStack() {
        st = new ArrayDeque<>();
        minst = new ArrayDeque<>();
    }
    
    public void push(int val) {
        st.push(val);
        if (minst.isEmpty()){
            minst.push(val);
        }else{
            minst.push(Math.min(val, minst.peek()));
        }
    }
    
    public void pop() {
        st.pop();
        minst.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}

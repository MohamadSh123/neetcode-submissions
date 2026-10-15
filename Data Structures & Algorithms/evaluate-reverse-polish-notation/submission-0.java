class Solution {
    public int evalRPN(String[] tokens) {
    Deque<Integer> st = new ArrayDeque<>();
    for (String t : tokens) {
        if (t.equals("+")) {
            int b = st.pop();
            int a = st.pop();
            st.push(a + b);
        } else if (t.equals("-")) {
            int b = st.pop();
            int a = st.pop();
            st.push(a - b);
        } else if (t.equals("*")) {
            int b = st.pop();
            int a = st.pop();
            st.push(a * b);
        } else if (t.equals("/")) {
            int b = st.pop();
            int a = st.pop();
            st.push(a / b);
        } else {
            st.push(Integer.parseInt(t));
        }
    }
    return st.pop();
    }
}

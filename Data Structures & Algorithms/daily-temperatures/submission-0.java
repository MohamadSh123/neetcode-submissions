class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!st.isEmpty() && 
            temperatures[st.peek()] < temperatures[i]) {
                int idx = st.pop();
                output[idx] = i - idx;
            }
            st.push(i);
        }
        return output;
    }
}

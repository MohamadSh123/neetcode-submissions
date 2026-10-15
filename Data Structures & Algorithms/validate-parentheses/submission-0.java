class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (pairs.containsKey(c)) {
                if (st.isEmpty()){
                    return false;
                } 
                char top = st.pop();
                if (top != pairs.get(c)){
                    return false;
                }
            } else {
                st.push(c);
                }   
        }
        return st.isEmpty();
    }
}

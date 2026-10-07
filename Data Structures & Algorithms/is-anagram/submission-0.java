class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        Map <Character , Integer> temp = new HashMap <>();
        for (char i : s.toCharArray()){
            temp.put(i, temp.getOrDefault(i, 0) + 1);
        }
        for (char j : t.toCharArray()){
            temp.put(j, temp.getOrDefault(j, 0) - 1);
        }
        for (int v : temp.values()){
            if (v != 0){
                return false;
            }
        }
         return true;
    }
}

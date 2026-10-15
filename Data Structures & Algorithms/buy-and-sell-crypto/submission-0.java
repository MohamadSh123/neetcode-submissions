class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int p : prices){
            minPrice = Math.min(minPrice, p);
            profit = Math.max(p - minPrice, profit);
        }
        return profit;
    }
}

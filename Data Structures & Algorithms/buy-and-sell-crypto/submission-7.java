class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (var price : prices) {
            max = Math.max(price - min, max);
            min = Math.min(price, min);
        }
        return max;
    }
}

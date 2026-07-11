class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int result = 0;
        for (; r < prices.length; r++) {
            if (prices[l] < prices[r]) {
                final int profit = prices[r] - prices[l];
                result = Math.max(result, profit);
            } else {
                l = r;
            }
        }
        return result;
    }
}

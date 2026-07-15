class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int l = 0;
        int r = 1;
        for (; r < prices.length; r++) {
            if (prices[l] >= prices[r]) {
                l = r;
            } else {
                int profit = prices[r] - prices[l];
                result = Math.max(result, profit);
            }
        }

        return result;
    }
}

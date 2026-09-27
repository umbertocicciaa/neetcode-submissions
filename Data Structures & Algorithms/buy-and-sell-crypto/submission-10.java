class Solution {
    public int maxProfit(int[] prices) {
        var maxProfit = 0;
        var l = 0;
        var r = 0;
        final var len = prices.length;
        for (; r < len; r++) {
            if (prices[l] > prices[r]) {
                l = r;
                continue;
            }
            final var profit = prices[r] - prices[l];
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}

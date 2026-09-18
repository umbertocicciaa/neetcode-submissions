class Solution {
    public int maxProfit(int[] prices) {
        var max = 0;
        var r = 1;
        var l = 0;
        final var len = prices.length;
        while (r < len) {
            if (prices[l] <= prices[r]) {
                var profit = prices[r] - prices[l];
                max = Math.max(profit, max);
            } else {
                l = r;
            }
            r++;
        }
        return max;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int r = 1;
        int l = 0;
        final int len = prices.length;
        for (; r < len; r++) {
            if (prices[l] > prices[r]) {
                l = r;
                continue;
            }
            final int profit = prices[r] - prices[l];
            max = Math.max(max, profit);
        }
        return max;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        for (; right < prices.length; right++) {
            if (prices[left] < prices[right]) {
                final int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right;
            }
        }
        return maxProfit;
    }
}

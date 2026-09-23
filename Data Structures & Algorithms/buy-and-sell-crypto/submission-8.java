class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxPrice = 0;
        for (; r < prices.length; r++) {
            final int price = prices[r] - prices[l];
            if (prices[l] < prices[r]) {
                maxPrice = Math.max(price, maxPrice);
            } else {
                l = r;
            }
        }
        return maxPrice;
    }
}

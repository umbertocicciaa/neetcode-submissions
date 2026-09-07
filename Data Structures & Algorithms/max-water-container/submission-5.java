class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while (i <= j) {
            final int base = j - i;
            final int height = Math.min(heights[j], heights[i]);
            final int area = base * height;
            maxArea = Math.max(maxArea, area);
            if (heights[i] <= heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}

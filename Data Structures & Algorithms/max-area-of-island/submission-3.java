class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                maxArea = Math.max(maxArea, area(grid, i, j));
            }
        }

        return maxArea;
    }

    private int area(int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }
        grid[r][c] = 0;
        int area = 1;
        area += area(grid, r + 1, c);
        area += area(grid, r, c + 1);
        area += area(grid, r - 1, c);
        area += area(grid, r, c - 1);
        return area;
    }
}
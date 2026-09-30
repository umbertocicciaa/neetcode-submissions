class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        var l = 0;
        final var DIM = matrix.length * matrix[0].length;
        final var COLS = matrix[0].length;
        var r = DIM - 1;
        while (l <= r) {
            final var MID = l + ((r - l) / 2);
            final var ROW = MID / COLS;
            final var COL = MID % COLS;
            if (matrix[ROW][COL] == target) {
                return true;
            }
            if (matrix[ROW][COL] > target) {
                r = MID - 1;
            } else {
                l = MID + 1;
            }
        }
        return false;
    }
}

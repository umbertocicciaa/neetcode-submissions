class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        var l = 0;
        var r = (matrix[0].length * matrix.length) - 1;
        while (l <= r) {
            final var MID = l + ((r - l) / 2);
            final var ROW = MID / matrix[0].length;
            final var COL = MID % matrix[0].length;
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

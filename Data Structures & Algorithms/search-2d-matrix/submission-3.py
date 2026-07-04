class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        ROWS, COLS = len(matrix), len(matrix[0])

        for row in matrix:
            start = 0
            end = COLS - 1

            if row[end] < target:
                continue

            while start <= end:
                mid = start + (end - start) // 2

                if row[mid] == target:
                    return True
                elif row[mid] > target:
                    end = mid - 1
                else:
                    start = mid + 1
        return False

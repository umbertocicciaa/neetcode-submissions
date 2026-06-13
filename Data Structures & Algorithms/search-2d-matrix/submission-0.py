class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        for row in matrix:
            start = 0
            end = len(row) -1
            while start <= end:
                mid = start + (end - start) // 2
                if row[mid] == target:
                    return True
                elif row[mid] > target:
                    end = mid - 1
                else:
                    start = mid + 1
        return False
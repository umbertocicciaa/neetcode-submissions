class Solution:
    def maxArea(self, heights: List[int]) -> int:
        res = 0
        area = 0
        l = 0
        r = len(heights) - 1

        while l < r:
            # min(heights[l], heights[r]) -> look figure
            area = min(heights[l], heights[r]) * (r - l)
            res = max(res, area)

            if heights[l] < heights[r]:
                # because i want maximum area
                l += 1
            else:
                r -= 1

        return res

class Solution:
    def maxArea(self, heights: List[int]) -> int:
        # heigh is the minimum array[i] or j (y axes), base is j-i (x axes)
        area = 0
        for i in range(len(heights)):
            for j in range(i + 1, len(heights)):
                area = max(area, min(heights[i], heights[j]) * (j - i))
        return area

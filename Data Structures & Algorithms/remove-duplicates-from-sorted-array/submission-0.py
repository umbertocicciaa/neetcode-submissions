class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        l = 1 # next position where to put values
        for i in range(1, n):
            if nums[i]!=nums[i-1]: # if they are different we found next different value
                nums[l]=nums[i]
                l+=1
        return l


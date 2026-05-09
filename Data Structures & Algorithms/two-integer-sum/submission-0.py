class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        i,j=0,1
        while i < len(nums):
            if j >= len(nums):
                i=i+1
                j=i+1
            if nums[i]+nums[j]==target:
                result = [i,j]
                return result
            else:
                j=j+1
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        i = 0
        j = 1
        res = []
        while i < len(nums) and j < len(nums):
            if nums[i] + nums[j] == target:
                res.append(i)
                res.append(j)
                return res
            if j == len(nums)-1:
                i = i+1
                j = i+1
            else:
                j = j+1
        return res
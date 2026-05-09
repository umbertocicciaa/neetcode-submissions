class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        i,j=0,1
        while i < len(nums):
            x = nums[i]
            while j < len(nums):
                y = nums[j]
                if x + y == target:
                    indexs = (i,j)
                    return list(indexs)
                j = j +1
            i = i +1
            j = i+1
        return []
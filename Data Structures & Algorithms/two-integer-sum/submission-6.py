from collections import defaultdict
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        if nums is None:
            raise Exception()
        values = defaultdict(int)    
        for i, num in enumerate(nums):
            if num in values:
                return [values[num],i]
            difference = target - nums[i]
            values[difference]=i
        return []
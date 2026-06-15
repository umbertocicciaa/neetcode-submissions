class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        values = defaultdict(int)
        for i, val in enumerate(nums):
            diff = target - val
            if diff in values:
                return [values[diff], i]
            values[val] = i
        return []
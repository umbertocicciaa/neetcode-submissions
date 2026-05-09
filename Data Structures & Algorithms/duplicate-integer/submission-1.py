class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        elements = set()
        for x in nums:
            elements.add(x)
        return len(nums)!=len(elements)
class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen = set()
        for num in nums:
            seen.add(num)
        duplicate = (len(seen)!=len(nums))
        return duplicate
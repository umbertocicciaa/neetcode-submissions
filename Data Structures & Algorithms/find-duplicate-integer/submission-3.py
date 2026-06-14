class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        slow,faster=0,0
        while True:
            slow = nums[slow]
            faster = nums[nums[faster]]
            if slow == faster:
                break
        slow = 0
        while slow != faster:
            slow = nums[slow]
            faster = nums[faster]
        return slow


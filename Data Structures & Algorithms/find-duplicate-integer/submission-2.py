class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        slow,faster=0,0
        while True:
            slow = nums[slow]
            faster = nums[nums[faster]]
            if slow == faster:
                break
        slow2 = 0
        while True:
            slow = nums[slow]
            slow2 = nums[slow2]
            if slow == slow2:
                return slow
        return -1


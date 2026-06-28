class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        num = set(nums)
        longest = 0
        for n in num:
            sequence_len = 0
            if n - 1 not in num:
                sequence_len += 1
                while n + sequence_len in num:
                    sequence_len += 1
                longest = max(longest, sequence_len)
        return longest

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums_s = set(nums)
        max_Sequence = 0
        for num in nums_s:
            sequence_len = 0
            if num - 1 not in nums_s:
                sequence_len += 1

                while num + sequence_len in nums_s:
                    sequence_len += 1

                max_Sequence = max(max_Sequence, sequence_len)

        return max_Sequence

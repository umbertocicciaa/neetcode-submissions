class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums_s = set(nums)
        max_Sequence = 0
        for num in nums:
            sequence = 0
            # if num - 1 our number start the sequence
            if num - 1 not in nums_s:
                sequence += 1
                while num + sequence in nums_s:
                    sequence += 1
                max_Sequence = max(max_Sequence, sequence)
        return max_Sequence

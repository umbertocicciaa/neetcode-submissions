class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        num_set = set(nums)
        longest = 0

        for num in num_set:
            # Condition that means we are starting a subsequence
            # in this indentention bloc we will count the subsequence
            if num - 1 not in num_set:
                sequence_len = 1

                while num + sequence_len in num_set:
                    sequence_len += 1

                longest = max(longest, sequence_len)

        return longest

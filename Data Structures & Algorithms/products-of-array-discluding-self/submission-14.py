class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)

        prefix = 1
        for i, num in enumerate(nums):
            res[i] = prefix
            prefix *= num

        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            # it's like doing prefix i * postfix i
            # because prefix was setup aldready in res in previpus for
            res[i] *= postfix
            postfix *= nums[i]

        return res

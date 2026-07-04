class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = []
        left_product = 1
        for num in nums:
            # skip first product so skipt itself
            res.append(left_product)
            left_product *= num
        right_product = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= right_product
            right_product *= nums[i]
        return res

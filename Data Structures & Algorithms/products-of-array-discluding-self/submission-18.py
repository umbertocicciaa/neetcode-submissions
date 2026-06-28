class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = []

        product_before_i = 1
        for num in nums:
            res.append(product_before_i)
            product_before_i *= num

        product_after_i = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= product_after_i
            product_after_i *= nums[i]
        return res

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = []
        left_products = 1
        for num in nums:
            res.append(left_products)
            left_products *= num
        righ_products = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= righ_products
            righ_products *= nums[i]
        return res

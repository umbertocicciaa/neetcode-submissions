class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [0]*len(nums)
        for i, num_i in enumerate(nums):
            product = 1
            for j, num_j in enumerate(nums):
                if i!=j:
                    product = product * num_j
            result[i] = product
        return result
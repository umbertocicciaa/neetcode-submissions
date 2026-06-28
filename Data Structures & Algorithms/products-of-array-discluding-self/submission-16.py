class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = []

        # res[i] = product all elements before i (not including res[i])
        prefix = 1
        for num in nums:
            res.append(prefix)
            prefix *= num
        
        # res[i] = product all elements after i (not including res[i])
        postfix = 1
        for i in range(len(nums)-1,-1,-1):
            res[i] *= postfix
            postfix *= nums[i]
        return res

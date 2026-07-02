class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        for i, num in enumerate(nums):
            # not more tirplets (we sorted array)
            if num > 0:
                break
            # Skip duplicate
            if i > 0 and num == nums[i - 1]:
                continue
            # l next of i r right pointer
            l, r = i + 1, len(nums) - 1
            while l < r:
                threesum = num + nums[l] + nums[r]
                if threesum == 0:
                    res.append([num, nums[l], nums[r]])
                    l += 1
                    r -= 1
                    # Skip duplicate
                    while nums[l] == nums[l - 1] and l < r:
                        l += 1
                elif threesum > 0:
                    r -= 1
                else:
                    l += 1
        return res

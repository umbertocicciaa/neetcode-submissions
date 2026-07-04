class Solution:
    def findMin(self, nums: List[int]) -> int:
        res = nums[0]
        left, right = 0, len(nums) - 1
        while left <= right:
            # ordered sub-array
            if nums[left] <= nums[right]:
                # left item is the minimum
                res = min(res, nums[left])
                break
            mid = left + ((right - left) // 2)
            res = min(res, nums[mid])
            # not ordered sub arrays
            if nums[mid] < nums[left]:
                right = mid - 1
            else:
                left = mid + 1
        return res

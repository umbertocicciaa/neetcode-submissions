class Solution:
    def search(self, nums: List[int], target: int) -> int:
        low = 0
        end = len(nums) - 1
        while low <= end:
            mid = low + ((low - low) // 2)
            if nums[mid] == target:
                return mid
            if nums[mid] > target:
                end = mid - 1
            else:
                low = mid + 1
        return -1
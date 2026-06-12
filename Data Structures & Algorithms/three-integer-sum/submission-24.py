class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        triplets = []
        nums = sorted(nums)
        # nums[i] + nums[j] + nums[k] == 0 
        # -nums[i] == nums[j] + nums[k]
        for i in range(len(nums) - 2):
            j = i + 1
            k = len(nums) - 1
            while j < k:
                if -nums[i] == nums[j] + nums[k]:
                    triplet = [nums[i], nums[j], nums[k]]
                    if triplet not in triplets:
                        triplets.append(triplet)
                    j += 1
                    k -= 1
                elif -nums[i] > nums[j] + nums[k]:
                    j += 1
                else:
                    k -=1
        return triplets
                        

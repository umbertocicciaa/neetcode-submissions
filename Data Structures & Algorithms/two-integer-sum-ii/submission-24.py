class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:

        for i in range(len(numbers)):
            start = i + 1
            end = len(numbers) - 1
            tmp = target - numbers[i]
            while start <= end:
                mid = start + (end - start) // 2
                if numbers[mid] == tmp:
                    return [i + 1, mid + 1]
                elif numbers[mid] < tmp:
                    start = mid + 1
                else:
                    end = mid - 1
        return []

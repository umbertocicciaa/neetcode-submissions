class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        res = []
        solution_find = False
        j = 1
        for i in range(len(numbers)):
            if solution_find:
                break
            x = numbers[i]
            while j < len(numbers):
                if i != j:
                    y = numbers[j]
                    if x + y == target:
                        res.append(i+1)
                        res.append(j+1)
                        solution_find = True
                        break
                j = j+1
            i = i + 1
            j = i + 1
        return res
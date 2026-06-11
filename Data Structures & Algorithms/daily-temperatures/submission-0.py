class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        monotonic_stack = []
        res = [0]*len(temperatures)
        for i, temp in enumerate(temperatures):
            while monotonic_stack and temp>temperatures[monotonic_stack[-1]]:
                index = monotonic_stack.pop()
                res[index] = i-index
            monotonic_stack.append(i)
        return res
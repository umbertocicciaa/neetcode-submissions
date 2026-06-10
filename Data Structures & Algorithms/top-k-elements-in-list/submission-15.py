class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        frequency = defaultdict(int)
        for num in nums:
            frequency[num] = frequency[num] + 1
        return heapq.nlargest(k, frequency.keys(), key=frequency.get)
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        res = []
        frequency = {}
        max_freq = 0
        for x in nums:
            frequency[x] = frequency.get(x,0) + 1
            if frequency[x] > max_freq:
                max_freq = frequency[x]
        sorted_frequency = dict(sorted(frequency.items(), key=lambda item: item[1], reverse=True))
        k_frequents = 1
        for x in sorted_frequency:
            res.append(x)
            if k_frequents == k:
                break
            k_frequents = k_frequents + 1
        return res
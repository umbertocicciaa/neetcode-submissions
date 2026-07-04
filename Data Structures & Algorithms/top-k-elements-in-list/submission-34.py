class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        res = []

        counter = defaultdict(int)
        frequency = defaultdict(list)

        for num in nums:
            counter[num] += 1

        for key, values in counter.items():
            frequency[values].append(key)

        max_frequency = max(counter.values())

        for i in range(max_frequency, 0, -1):
            for num in frequency[i]:
                res.append(num)
                if len(res) == k:
                    return res
        return res

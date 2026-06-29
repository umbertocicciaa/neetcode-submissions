class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        res = []

        counter = defaultdict(int)
        frequency_values = defaultdict(list)

        for num in nums:
            counter[num] += 1

        for num, frequency in counter.items():
            frequency_values[frequency].append(num)

        max_freq = max(counter.values())

        for i in range(max_freq, 0, -1):
            for num in frequency_values[i]:
                res.append(num)
                if (len(res)) == k:
                    return res
        return res

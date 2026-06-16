class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = defaultdict(int)
        frequency = defaultdict(list)
        res = []

        for num in nums:
            count[num] += 1

        for num, cnt in count.items():
            frequency[cnt].append(num)

        max_freq = max(count.values())

        for i in range(max_freq, 0, -1):
            for num in frequency[i]:
                res.append(num)
                if len(res) == k:
                    return res

        return res

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        res = []

        number_frequency = defaultdict(int)
        frequency_numbers = defaultdict(list)

        for num in nums:
            number_frequency[num] += 1

        for number, frequency in number_frequency.items():
            frequency_numbers[frequency].append(number)

        max_frequency = max(number_frequency.values())

        for i in range(max_frequency, 0, -1):
            for num in frequency_numbers[i]:
                res.append(num)
                if len(res) == k:
                    return res

        return res

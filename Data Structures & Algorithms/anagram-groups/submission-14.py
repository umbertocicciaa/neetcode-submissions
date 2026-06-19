class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        frequency = defaultdict(list)
        for string in strs:
            count = [0]*26
            for c in string:
                count[ord(c) - ord('a')] += 1
            frequency[tuple(count)].append(string)
        return list(frequency.values())

        


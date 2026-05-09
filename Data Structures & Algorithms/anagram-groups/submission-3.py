class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrammy = defaultdict(list)
        for string in strs:
            key = tuple(sorted(string))
            anagrammy[key].append(string)
        return list(anagrammy.values())


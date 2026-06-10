class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs:
            raise Exception
        if len(strs) == 1:
            return [[strs[0]]]
        anagrams = defaultdict(list)
        for string in strs:
            sorted_s = ''.join(sorted(string))
            anagrams[sorted_s].append(string)
        return list(anagrams.values())
        


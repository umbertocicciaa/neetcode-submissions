class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs:
            raise Exception
        if len(strs) == 1:
            return [[strs[0]]]
        anagrams = []
        for string in strs:
            found = False
            for anagram in anagrams:
                for sr in anagram:
                    if sorted(string) == sorted(sr):
                        anagram.append(string)
                        found = True
                        break
                if found:
                    break
            if not found:
                anagrams.append([string])  
        return anagrams
        


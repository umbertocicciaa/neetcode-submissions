class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = []
        i = 0
        j = 1
        anagrammy = []
        while i < len(strs):
            string_a = strs[i]
            anagrammy = [string_a]
            j = i+1
            while j < len(strs):
                string_b = strs[j]
                if sorted(string_a) == sorted(string_b):
                    anagrammy.append(string_b)
                j += 1
            duplicate = False
            for arr in res:
                for s_arr in arr:
                    if s_arr in anagrammy:
                        duplicate = True
                        break
                if duplicate:
                    break
            if not duplicate and anagrammy not in res:
                res.append(anagrammy)
            i += 1
        return res

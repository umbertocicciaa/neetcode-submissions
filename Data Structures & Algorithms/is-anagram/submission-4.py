class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        counterS, counterT = {}, {}
        i = j = 0

        while i < len(s) and j < len(t):
            counterS[s[i]] = counterS.get(s[i], 0) + 1
            counterT[t[j]] = counterT.get(t[j], 0) + 1
            i += 1
            j += 1

        if i < len(s) and j == len(t):
            return False
        
        if j < len(t) and i == len(s):
            return False

        return counterS == counterT
            
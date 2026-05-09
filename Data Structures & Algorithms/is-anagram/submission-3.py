class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        counterS, counterT = {}, {}
        i = j = 0

        while i < len(s) and j < len(t):
            counterS[s[i]] = counterS.get(s[i], 0) + 1
            counterT[t[j]] = counterT.get(t[j], 0) + 1
            i += 1
            j += 1

        while i < len(s):
            counterS[s[i]] = counterS.get(s[i], 0) + 1
            i += 1

        while j < len(t):
            counterT[t[j]] = counterT.get(t[j], 0) + 1
            j += 1

        return counterS == counterT
            
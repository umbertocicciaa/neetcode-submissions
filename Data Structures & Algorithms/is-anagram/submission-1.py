class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False
        
        i = 0
        s1, s2 = {}, {}

        while i < len(s):
            c1, c2 = s[i], t[i]
            s1[c1] = s1.get(c1, 0) + 1
            s2[c2] = s2.get(c2, 0) + 1
            i += 1

        if len(s1.keys()) != len(s2.keys()) :
            return False

        return s1 == s2

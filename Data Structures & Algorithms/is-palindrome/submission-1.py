class Solution:
    def isPalindrome(self, s: str) -> bool:
        i = 0
        j = len(s) - 1
        phrase = s.strip().lower()
        while i < j:
            while i < j and not phrase[i].isalnum():
                i = i + 1
            while i < j and not phrase[j].isalnum():
                j = j - 1
            if phrase[i] != phrase[j]:
                return False
            i = i + 1
            j = j - 1
        return True

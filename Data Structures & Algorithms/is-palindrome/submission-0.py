class Solution:
    def isPalindrome(self, s: str) -> bool:
        strs = "".join(ch.lower() for ch in s if ch.isalnum())
        for i in range(len(strs) // 2):
            if strs[i] != strs[len(strs) - i - 1]:
                return False
        return True
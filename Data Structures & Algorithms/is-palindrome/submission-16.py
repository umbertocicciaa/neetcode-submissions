class Solution:
    def isPalindrome(self, s: str) -> bool:
        if not s:
            raise Exception()
        start = 0
        end = len(s)-1
        while start < end:
            while start < end and not s[start].isalnum():
                start = start + 1
            while start < end and not s[end].isalnum():
                end = end -1
            if s[start].lower()!=s[end].lower():
                return False
            start = start + 1
            end = end -1
        return True
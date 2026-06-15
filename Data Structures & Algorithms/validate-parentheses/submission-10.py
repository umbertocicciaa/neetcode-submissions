class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for i in range(len(s)):
            if s[i] == "}" or s[i] == ")" or s[i] == "]":
                if len(stack) == 0:
                    return False
                character = stack.pop()
                if s[i] == "}" and character != "{":
                    return False
                elif s[i] == "]" and character != "[":
                    return False
                elif s[i] == ")" and character != "(":
                    return False
            else:
                stack.append(s[i])
        return len(stack) == 0
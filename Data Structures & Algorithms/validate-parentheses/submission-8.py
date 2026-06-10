class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for i in range(len(s)):
            if s[i] == "}" or s[i] == ")" or s[i] == "]":
                if len(stack) == 0:
                    return False
                if s[i] == "}" and stack.pop() != "{":
                    return False
                elif s[i] == ")" and stack.pop() != "(":
                    return False                
                elif s[i] == "]" and stack.pop() != "[":
                    return False
            else:
                stack.append(s[i])
        return len(stack) == 0
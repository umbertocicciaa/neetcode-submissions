class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if strs is None:
            raise Exception()
        if len(strs)==0:
            return strs[0]
        prefix = strs[0]
        for string in strs[1:]:
            while not string.startswith(prefix):
                prefix = prefix[:-1]
        return prefix
                

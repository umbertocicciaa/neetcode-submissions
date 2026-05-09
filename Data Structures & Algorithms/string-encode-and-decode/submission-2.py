class Solution:

    def encode(self, strs: List[str]) -> str:
        rsl = ''
        for string in strs:
            rsl=rsl+string+('##!!##!!')
        return rsl

    def decode(self, s: str) -> List[str]:
        dec = s.split('##!!##!!')
        return dec[:-1]
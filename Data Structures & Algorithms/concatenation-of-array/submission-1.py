class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        if nums is None:
            raise Exception()
        ans = [0] * len(nums) * 2
        for i, num in enumerate(nums):
            ans[i] = ans[i+len(nums)]= num
        if ans == None or len(ans)!=len(nums) * 2:
            raise Exception()
        return ans
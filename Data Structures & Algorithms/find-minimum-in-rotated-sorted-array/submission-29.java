class Solution {
    public int findMin(int[] nums) {
        var l = 0;
        var r = nums.length - 1;
        while (l < r) {
            final var MID = l + ((r - l) / 2);
            if (nums[MID] < nums[r]) {
                r = MID;
            } else {
                l = MID + 1;
            }
        }
        return nums[l];
    }
}

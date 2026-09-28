class Solution {
    public int findMin(int[] nums) {
        var l = 0;
        var r = nums.length - 1;

        while (l < r) {
            final var mid = l + ((r - l) / 2);
            if (nums[mid] < nums[r]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return nums[l];
    }
}

class Solution {
    public int search(int[] nums, int target) {
        var l = 0;
        var r = nums.length - 1;
        while (l < r) {
            final var mid = l + ((r - l) / 2);
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return (l < nums.length && nums[l] == target) ? l : -1;
    }
}

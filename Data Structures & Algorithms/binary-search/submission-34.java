class Solution {
    public int search(int[] nums, int target) {
        var l = 0;
        var r = nums.length - 1;
        while (l <= r) {
            final var mid = l + ((r - l) / 2);
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}

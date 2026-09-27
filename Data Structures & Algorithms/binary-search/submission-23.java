class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length;
        while (start < end) {
            final var mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return (start < nums.length && nums[start] == target) ? start : -1;
    }
}

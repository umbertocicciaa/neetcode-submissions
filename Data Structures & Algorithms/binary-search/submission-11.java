class Solution {
    public int search(int[] nums, int target) {
        var start = 0;
        var end = nums.length - 1;
        while (start <= end) {
            final var mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

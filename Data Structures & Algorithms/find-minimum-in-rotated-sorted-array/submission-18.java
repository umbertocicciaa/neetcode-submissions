class Solution {
    public int findMin(int[] nums) {
        var min = nums[0];
        var l = 0;
        var r = nums.length - 1;
        while (l <= r) {
            if (nums[l] <= nums[r]) {
                min = Math.min(min, nums[l]);
                break;
            }
            final var mid = l + ((r - l) / 2);
            min = Math.min(min, nums[mid]);
            if (nums[mid] < nums[l]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return min;
    }
}

class Solution {
    public int findMin(int[] nums) {
        var l = 0;
        var r = nums.length - 1;
        var min = nums[0];

        while (l < r) {
            // sub-array ordered
            if (nums[l] <= nums[r]) {
                min = Math.min(min, nums[l]);
                break;
            }
            // sub-array not ordered
            final var mid = l + ((r - l / 2));
            min = Math.min(min, nums[mid]);
            // sub-array not ordered so check on the right if not greater instead of left
            if (nums[l] <= nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return min;
    }
}

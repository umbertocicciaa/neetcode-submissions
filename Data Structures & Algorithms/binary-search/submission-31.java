class Solution {
    public int search(int[] nums, int target) {
        var l = 0;
        var r = nums.length;
        while (l < r) {
            final var mid = l + ((r - l) / 2);
            if (nums[mid] > target)
                r = mid;
            else
                l = mid + 1;
        }
        return (l > 0 && target == nums[l - 1]) ? l - 1 : -1;
    }
}

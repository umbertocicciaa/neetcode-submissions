class Solution {
    public int findDuplicate(int[] nums) {
        var slow = 0;
        var fast = slow;
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) {
                break;
            }
        }
        int start = 0;
        while (true) {
            start = nums[start];
            slow = nums[slow];
            if (slow == start) {
                return start;
            }
        }
    }
}

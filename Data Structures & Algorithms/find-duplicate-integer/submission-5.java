class Solution {
    public int findDuplicate(int[] nums) {
        var set = new HashSet<Integer>();
        var slow = 0;
        var fast = 0;
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast)
                break;
        }
        var start = 0;
        // while slow != fast
        while (true) {
            start = nums[start];
            slow = nums[slow];
            if (start == slow) {
                return slow;
            }
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return new int[] {};
        }

        final Map<Integer, Integer> values = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            final int difference = target - nums[i];
            if (values.containsKey(difference)) {
                return new int[] {values.get(difference), i};
            }
            values.put(nums[i], i);
        }
        return new int[] {};
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return new int[] {};
        }
        final Map<Integer, Integer> values = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            final int differences = target - nums[i];
            if (values.containsKey(differences)) {
                return new int[] {values.get(differences), i};
            }
            values.put(nums[i], i);
        }
        return new int[] {};
    }
}

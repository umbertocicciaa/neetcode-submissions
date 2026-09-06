class Solution {
    public int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> numbersPosition = new HashMap<>();
        final int len = nums.length;
        for (int i = 0; i < len; i++) {
            final int difference = target - nums[i];
            if (numbersPosition.containsKey(difference)) {
                return new int[] {numbersPosition.get(difference), i};
            }
            numbersPosition.put(nums[i], i);
        }
        return new int[] {};
    }
}

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        final List<List<Integer>> subset = new ArrayList<>();
        final List<Integer> currentSubset = new ArrayList<>();
        Arrays.sort(nums);
        subsetsHelper(subset, currentSubset, nums, 0);
        return subset;
    }
    private static void subsetsHelper(
        List<List<Integer>> subset, List<Integer> currentSubset, int[] nums, int index) {
        if (index >= nums.length) {
            subset.add(new ArrayList<>(currentSubset));
            return;
        }
        currentSubset.add(nums[index]);
        subsetsHelper(subset, currentSubset, nums, index + 1);
        currentSubset.remove(currentSubset.size() - 1);

        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }
        subsetsHelper(subset, currentSubset, nums, index + 1);
    }
}

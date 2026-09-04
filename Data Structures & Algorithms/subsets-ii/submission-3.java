class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        final List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        subset(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private static void subset(
        List<List<Integer>> result, List<Integer> current, int[] nums, int i) {
        if (i >= nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[i]);
        subset(result, current, nums, i + 1);

        current.remove(current.size() - 1);
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i += 1;
        }
        subset(result, current, nums, i + 1);
    }
}

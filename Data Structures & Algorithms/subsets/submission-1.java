class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        final List<List<Integer>> result = new ArrayList<>();
        subset(0, result, new ArrayList<>(), nums);
        return result;
    }

    private static void subset(
        int i, List<List<Integer>> result, List<Integer> current, int[] nums) {
        if (i >= nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[i]);
        subset(i + 1, result, current, nums);

        current.remove(current.size()-1);
        subset(i + 1, result, current, nums);
    }
}

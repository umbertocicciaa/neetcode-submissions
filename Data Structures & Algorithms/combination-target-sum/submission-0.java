class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        final List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        combination(result, new ArrayList<>(), nums, target, 0, 0);
        return result;
    }

    private static void combination(List<List<Integer>> result, List<Integer> curr, int[] nums,
        int target, int current, int i) {
        if (target == current) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int j = i; j < nums.length; j++) {
            if (nums[j] + current > target) {
                return;
            }
            curr.add(nums[j]);
            combination(result, curr, nums, target, current + nums[j], j);
            curr.remove(curr.size() - 1);
        }
    }
}

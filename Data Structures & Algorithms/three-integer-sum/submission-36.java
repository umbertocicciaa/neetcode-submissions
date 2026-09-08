class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        final List<List<Integer>> res = new ArrayList<>();
        final int len = nums.length;
        for (int i = 0; i < len; i++) {
            // optimization
            if (nums[i] > 0)
                break;
            // skip duplicate
            if (i > 0 && nums[i - 1] == nums[i])
                continue;
            int l = i + 1;
            int r = len - 1;
            while (l < r) {
                final int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    final List<Integer> triplets = Arrays.asList(nums[i], nums[l], nums[r]);
                    res.add(triplets);
                    // otherwise we skip possible new solutions
                    l++;
                    r--;
                    // skip duplicate
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return res;
    }
}

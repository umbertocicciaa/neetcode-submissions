class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        // [-4, -1, -1, 0, 1, 2]
        final List<List<Integer>> res = new ArrayList<>();
        final int len = nums.length;
        for (int i = 0; i < len; i++) {
            // we can't find anymore solutions, array is sorted
            int l = i + 1;
            int r = len - 1;
            while (l < r) {
                final int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    final List<Integer> triplets = Arrays.asList(nums[i], nums[l], nums[r]);
                    if (!res.contains(triplets)) {
                        res.add(triplets);
                    }
                    // otherwise we skip possible new solutions
                    l++;
                    r--;
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

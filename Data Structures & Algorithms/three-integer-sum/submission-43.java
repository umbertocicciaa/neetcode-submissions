class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        final List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        final var len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            var j = i + 1;
            var k = len - 1;
            while (j < k) {
                final var sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    res.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return res;
    }
}

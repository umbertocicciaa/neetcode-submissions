class Solution {
    public int[] twoSum(int[] nums, int target) {
        final int[][] numIndex = new int[nums.length][2];
        final int len = nums.length;
        for (int i = 0; i < len; i++) {
            numIndex[i][0] = nums[i];
            numIndex[i][1] = i;
        }
        Arrays.sort(numIndex, Comparator.comparingInt(num -> num[0]));
        int i = 0;
        int j = len - 1;
        while (i < j) {
            final int sum = numIndex[j][0] + numIndex[i][0];
            if (sum == target) {
                return new int[] {Math.min(numIndex[i][1], numIndex[j][1]),
                    Math.max(numIndex[i][1], numIndex[j][1])};
            }
            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}

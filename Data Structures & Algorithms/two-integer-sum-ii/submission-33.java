class Solution {
    public int[] twoSum(int[] numbers, int target) {
        final int len = numbers.length;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            final int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] {left + 1, right + 1};
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }
}

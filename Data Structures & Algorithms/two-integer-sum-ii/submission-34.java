class Solution {
    public int[] twoSum(int[] numbers, int target) {
        final int len = numbers.length;
        for (int i = 0; i < len; i++) {
            final int tentative = target - numbers[i];
            int l = i + 1;
            int r = len - 1;
            while (l <= r) {
                final int mid = l + (r - l) / 2;
                if (tentative == numbers[mid]) {
                    return new int[] {i + 1, mid + 1};
                }
                if (numbers[mid] < tentative) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return new int[] {};
    }
}

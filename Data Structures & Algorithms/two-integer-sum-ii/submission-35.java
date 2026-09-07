class Solution {
    public int[] twoSum(int[] numbers, int target) {
        final Map<Integer, Integer> numberPosition = new HashMap<>();
        final int len = numbers.length;
        for (int i = 0; i < len; i++) {
            final int differences = target - numbers[i];
            if (numberPosition.containsKey(differences)) {
                return new int[] {numberPosition.get(differences) + 1, i + 1};
            }
            numberPosition.put(numbers[i], i);
        }
        return new int[] {};
    }
}

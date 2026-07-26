class Solution {
    public int longestConsecutive(int[] nums) {
        final Set<Integer> uniqueNumbers = new HashSet<>();

        for (final int num : nums) {
            uniqueNumbers.add(num);
        }

        int maxSequence = 0;
        for (final int number : nums) {
            int sequenceLength = 0;
            if (!uniqueNumbers.contains(number - 1)) {
                sequenceLength++;
                while (uniqueNumbers.contains(number + sequenceLength)) sequenceLength++;
                maxSequence = Math.max(maxSequence, sequenceLength);
            }
        }
        return maxSequence;
    }
}

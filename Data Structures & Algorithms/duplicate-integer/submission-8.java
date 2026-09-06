class Solution {
    public boolean hasDuplicate(int[] nums) {
        final Set<Integer> numbers = new HashSet<>();
        for (var num : nums) {
            if (numbers.contains(num)) {
                return true;
            }
            numbers.add(num);
        }
        return false;
    }
}
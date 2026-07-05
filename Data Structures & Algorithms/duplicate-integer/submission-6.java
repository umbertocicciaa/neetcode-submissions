class Solution {
    public boolean hasDuplicate(int[] nums) {
        final Set<Integer> duplicate = new HashSet<>();
        for (final int num : nums){
            if (duplicate.contains(num)){
                return true;
            }
            duplicate.add(num);
        }
        return false;
    }   
}
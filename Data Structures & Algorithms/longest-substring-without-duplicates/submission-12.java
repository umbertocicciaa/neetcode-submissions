class Solution {
    public int lengthOfLongestSubstring(String s) {
        int dimension = 0;
        int l = 0;
        int r = 0;
        final int len = s.length();
        final Map<Character, Integer> characters = new HashMap<>();
        for (; r < len; r++) {
            if (characters.containsKey(s.charAt(r))) {
                // Math.max between new and old because we never have to go back
                l = Math.max(characters.get(s.charAt(r)) + 1, l);
            }
            characters.put(s.charAt(r), r);
            final int windowLen = r - l + 1;
            dimension = Math.max(dimension, windowLen);
        }
        return dimension;
    }
}

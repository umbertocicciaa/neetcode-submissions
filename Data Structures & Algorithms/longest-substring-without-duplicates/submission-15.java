class Solution {
    public int lengthOfLongestSubstring(String s) {
        int substring = 0;
        int l = 0;
        int r = 0;
        final int len = s.length();
        final Map<Character, Integer> characters = new HashMap<>();
        for (; r < len; r++) {
            if (characters.containsKey(s.charAt(r))) {
                // l must not be an old entry of the character if it is duplicated
                l = Math.max(l, characters.get(s.charAt(r)) + 1);
            }
            characters.put(s.charAt(r), r);
            final int window = r - l + 1;
            substring = Math.max(substring, window);
        }
        return substring;
    }
}

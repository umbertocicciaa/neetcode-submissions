class Solution {
    public int lengthOfLongestSubstring(String s) {
        var l = 0;
        var max = 0;
        final var CHARS = new HashSet<Character>();
        for (var r = 0; r < s.length(); r++) {
            while (CHARS.contains(s.charAt(r))) {
                CHARS.remove(s.charAt(l));
                l++;
            }
            CHARS.add(s.charAt(r));
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}

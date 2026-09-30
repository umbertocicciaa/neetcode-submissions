class Solution {
    public int lengthOfLongestSubstring(String s) {
        final var LEN = s.length();
        var res = 0;
        var l = 0;
        final var CHARS = new HashSet<Character>();
        for (var r = 0; r < LEN; r++) {
            while (CHARS.contains(s.charAt(r))) {
                CHARS.remove(s.charAt(l));
                l++;
            }
            CHARS.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}

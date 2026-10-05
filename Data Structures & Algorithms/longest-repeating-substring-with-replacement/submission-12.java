class Solution {
    public int characterReplacement(String s, int k) {
        final var CHRS = new HashSet<Character>();
        for (var c : s.toCharArray()) {
            CHRS.add(c);
        }
        final var CHARACTERS = Collections.unmodifiableSet(CHRS);
        final var LEN = s.length();
        var longest = 0;
        for (var c : CHARACTERS) {
            var count = 0;
            var l = 0;
            for (var r = 0; r < LEN; r++) {
                if (s.charAt(r) == c) {
                    count++;
                }
                while (r - l + 1 - count > k) {
                    if (s.charAt(l) == c) {
                        count--;
                    }
                    l++;
                }
                longest = Math.max(longest, r - l + 1);
            }
        }
        return longest;
    }
}

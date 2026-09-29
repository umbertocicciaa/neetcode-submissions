class Solution {
    public int characterReplacement(String s, int k) {
        final var LEN = s.length();
        final var CHRS = new HashSet<Character>();
        for (var c : s.toCharArray()) {
            CHRS.add(c);
        }
        final var CHARACTERS = Collections.unmodifiableSet(CHRS);
        var res = 0;
        for (var c : CHRS) {
            var counter = 0;
            var l = 0;
            for (var r = 0; r < LEN; r++) {
                if (s.charAt(r) == c) {
                    counter++;
                }
                while (r - l + 1 - counter > k) {
                    if (s.charAt(l) == c) {
                        counter--;
                    }
                    l++;
                }
                res = Math.max(res, r - l + 1);
            }
        }
        return res;
    }
}

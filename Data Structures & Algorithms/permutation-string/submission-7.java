class Solution {
    public boolean checkInclusion(String s1, String s2) {
        final var CHRS = new HashMap<Character, Integer>();
        for (var c : s1.toCharArray()) {
            CHRS.put(c, CHRS.getOrDefault(c, 0) + 1);
        }
        final var CHARACTERS = Collections.unmodifiableMap(CHRS);
        final var PERMUTATIONS = new HashMap<Character, Integer>();
        var l = 0;
        for (var r = 0; r < s2.length(); r++) {
            final var WINDOWSIZE = r - l + 1;
            PERMUTATIONS.put(s2.charAt(r), PERMUTATIONS.getOrDefault(s2.charAt(r), 0) + 1);
            if (WINDOWSIZE != s1.length()) {
                continue;
            }
            if (PERMUTATIONS.equals(CHARACTERS)) {
                return true;
            }
            PERMUTATIONS.put(s2.charAt(l), PERMUTATIONS.get(s2.charAt(l)) - 1);
            if (PERMUTATIONS.get(s2.charAt(l)) == 0) {
                PERMUTATIONS.remove(s2.charAt(l));
            }
            l++;
        }
        return false;
    }
}

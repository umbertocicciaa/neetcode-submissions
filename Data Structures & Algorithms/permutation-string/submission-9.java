class Solution {
    public boolean checkInclusion(String s1, String s2) {
        final var CHR = new HashMap<Character, Integer>();

        for (var c : s1.toCharArray()) {
            CHR.put(c, CHR.getOrDefault(c, 0) + 1);
        }

        final var CHARACTERS = Collections.unmodifiableMap(CHR);
        final var PERMUTATION = new HashMap<Character, Integer>();

        var l = 0;

        for (var r = 0; r < s2.length(); r++) {
            var c = s2.charAt(r);

            PERMUTATION.put(c, PERMUTATION.getOrDefault(c, 0) + 1);

            while (r - l + 1 > s1.length()) {
                var leftChar = s2.charAt(l);

                PERMUTATION.put(leftChar, PERMUTATION.get(leftChar) - 1);

                if (PERMUTATION.get(leftChar) == 0) {
                    PERMUTATION.remove(leftChar);
                }

                l++;
            }

            if (PERMUTATION.equals(CHARACTERS)) {
                return true;
            }
        }

        return false;
    }
}
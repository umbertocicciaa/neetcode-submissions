class Solution {
    public boolean checkInclusion(String s1, String s2) {
        final Map<Character, Integer> CHRS = new HashMap<>();
        for (var c : s1.toCharArray()) {
            CHRS.put(c, CHRS.getOrDefault(c, 0) + 1);
        }
        final Map<Character, Integer> CHARACTERS = Collections.unmodifiableMap(CHRS);
        final var MAX_WINDOW = s1.length();
        var l = 0;
        final Map<Character, Integer> WINDOW = new HashMap<>();
        for (var r = 0; r < s2.length(); r++) {
            WINDOW.put(s2.charAt(r), WINDOW.getOrDefault(s2.charAt(r), 0) + 1);
            final var CURR_WINDOW = r - l + 1;
            if (CURR_WINDOW == MAX_WINDOW) {
                if (WINDOW.equals(CHARACTERS)) {
                    return true;
                }
                WINDOW.put(s2.charAt(l), WINDOW.getOrDefault(s2.charAt(l), 1) - 1);
                if (WINDOW.get(s2.charAt(l)) == 0) {
                    WINDOW.remove(s2.charAt(l));
                }
                l++;
            }
        }
        return false;
    }
}

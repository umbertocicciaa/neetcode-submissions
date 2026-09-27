class Solution {
    public boolean checkInclusion(String s1, String s2) {
        final Map<Character, Integer> chrs = new HashMap<>();
        for (var c : s1.toCharArray()) {
            chrs.put(c, chrs.getOrDefault(c, 0) + 1);
        }
        final Map<Character, Integer> characters = Collections.unmodifiableMap(chrs);
        int l = 0;
        final Map<Character, Integer> window = new HashMap<>();
        for (var r = 0; r < s2.length(); r++) {
            final var rightChar = s2.charAt(r);
            window.put(rightChar, window.getOrDefault(rightChar, 0) + 1);
            if (r - l + 1 == s1.length()) {
                if (window.equals(characters)) {
                    return true;
                }
                final var leftChar = s2.charAt(l);
                window.put(leftChar, window.getOrDefault(leftChar, 1) - 1);
                if (window.get(leftChar) == 0) {
                    window.remove(leftChar);
                }
                l++;
            }
        }
        return false;
    }
}

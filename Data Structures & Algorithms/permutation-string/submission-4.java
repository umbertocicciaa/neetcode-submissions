class Solution {
    public boolean checkInclusion(String s1, String s2) {
        final Map<Character, Integer> chars = new HashMap<>();
        for (var c : s1.toCharArray()) {
            chars.put(c, chars.getOrDefault(c, 0) + 1);
        }
        final Map<Character, Integer> characters = Collections.unmodifiableMap(chars);
        final Map<Character, Integer> window = new HashMap<>();
        final var len = s2.length();
        var l = 0;
        for (var r = 0; r < len; r++) {
            final var c = s2.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (r - l + 1 == s1.length()) {
                if (window.equals(characters)) {
                    return true;
                }
                final var chr = s2.charAt(l);
                window.put(chr, window.get(chr) - 1);
                if (window.get(chr) == 0) {
                    window.remove(chr);
                }
                l++;
            }
        }
        return false;
    }
}

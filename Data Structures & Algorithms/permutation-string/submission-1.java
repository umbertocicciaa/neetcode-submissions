class Solution {
    public boolean checkInclusion(String s1, String s2) {
        final int window = s1.length();
        final Map<Character, Integer> frequencies = new HashMap<>();
        for (final char c : s1.toCharArray()) {
            frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
        }
        final Map<Character, Integer> occurencies = new HashMap<>();
        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            final char c = s2.charAt(right);
            occurencies.put(c, occurencies.getOrDefault(c, 0) + 1);
            if (right - left + 1 > window) {
                final char leftChar = s2.charAt(left);
                occurencies.put(leftChar, occurencies.get(leftChar) - 1);
                if (occurencies.get(leftChar) == 0) {
                    occurencies.remove(leftChar);
                }
                left++;
            }
            if (right - left + 1 == window && occurencies.equals(frequencies)) {
                return true;
            }
        }
        return false;
    }
}
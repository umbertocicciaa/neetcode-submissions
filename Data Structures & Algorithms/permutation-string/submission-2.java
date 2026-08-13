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
            occurencies.put(s2.charAt(right), occurencies.getOrDefault(s2.charAt(right), 0) + 1);
            if (right - left + 1 > window) {
                occurencies.put(s2.charAt(left), occurencies.get(s2.charAt(left)) - 1);
                if (occurencies.get(s2.charAt(left)) == 0) {
                    occurencies.remove(s2.charAt(left));
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
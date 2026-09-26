class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        final Set<Character> characters = new HashSet<>();
        for (char c : s.toCharArray()) {
            characters.add(c);
        }
        for (char c : characters) {
            int count = 0;
            int l = 0;
            for (int r = 0; r < s.length(); r++) {
                if (s.charAt(r) == c) {
                    count++;
                }
                // characters that aren't c = window_size - count
                // after the while we have the maximum amount of characters we can change to become
                // c
                while ((r - l + 1) - count > k) {
                    // count-- because with l++ we decrement the window size, so the characters
                    // that are c
                    if (s.charAt(l) == c) {
                        count--;
                    }
                    l++;
                }
                max = Math.max(max, r - l + 1);
            }
        }
        return max;
    }
}
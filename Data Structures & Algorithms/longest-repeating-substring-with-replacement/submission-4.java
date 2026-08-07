class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        final Set<Character> characters = new HashSet<>();
        for (char c : s.toCharArray()) {
            characters.add(c);
        }
        for (char c : characters) {
            int frequency = 0;
            int left = 0;
            for (int right = 0; right < s.length(); right++) {
                if (s.charAt(right) == c) {
                    frequency++;
                }
                // (right - left + 1) - frequency Replacement needed
                while ((right - left + 1) - frequency > k) {
                    if (s.charAt(left) == c) {
                        frequency--;
                    }
                    left++;
                }
                res = Math.max(res, right - left + 1);
            }
        }
        return res;
    }
}
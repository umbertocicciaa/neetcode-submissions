class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        final Set<Character> characters = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (characters.contains(s.charAt(right))) {
                characters.remove(s.charAt(left));
                left++;
            }
            characters.add(s.charAt(right));
            maxLen = Math.max(right - left + 1, maxLen);
        }

        return maxLen;
    }
}

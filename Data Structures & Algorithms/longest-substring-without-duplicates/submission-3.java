class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int l = 0;
        final Set<Character> characters = new HashSet<Character>();
        for (int r = 0; r < s.length(); r++) {
            while (characters.contains(s.charAt(r))) {
                characters.remove(s.charAt(l));
                l++;
            }
            characters.add(s.charAt(r));
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}

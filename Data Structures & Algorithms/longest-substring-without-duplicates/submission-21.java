class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        final int len = s.length();
        int l = 0;
        int r = 0;
        final Set<Character> chars = new HashSet<>();
        for (; r < len; r++) {
            while (chars.contains(s.charAt(r))) {
                chars.remove(s.charAt(l));
                l++;
            }
            chars.add(s.charAt(r));
            longest = Math.max(r - l + 1, longest);
        }
        return longest;
    }
}

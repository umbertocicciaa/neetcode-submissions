class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxSubstringLength = 0;
        int left = 0;
        final Set<Character> substring = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (substring.contains(s.charAt(right))) {
                substring.remove(s.charAt(left));
                left++;
            }
            substring.add(s.charAt(right));
            final int length = right - left + 1;
            maxSubstringLength = Math.max(maxSubstringLength, length);
        }
        return maxSubstringLength;
    }
}

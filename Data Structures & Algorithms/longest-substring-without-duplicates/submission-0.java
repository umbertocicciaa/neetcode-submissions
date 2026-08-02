class Solution {
    public int lengthOfLongestSubstring(String s) {
        int substringLenght = 0;
        int j = 0;
        final Set<Character> subString = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            final char currentChar = s.charAt(i);

            while (subString.contains(currentChar)) {
                final char previousChar = s.charAt(j);

                subString.remove(previousChar);
                j++;
            }
            subString.add(currentChar);
            final int length = i - j + 1;
            substringLenght = Math.max(substringLenght, length);
        }

        return substringLenght;
    }
}

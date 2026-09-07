public class Solution {
    public boolean isPalindrome(String s) {
        final StringBuilder reverseBuilder = new StringBuilder();
        final int len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            final char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                reverseBuilder.append(Character.toLowerCase(c));
            }
        }
        final String reverse = reverseBuilder.toString();
        final String original = reverseBuilder.reverse().toString();
        return reverse.equals(original);
    }
}
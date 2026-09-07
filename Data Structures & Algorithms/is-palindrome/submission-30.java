public class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (!Character.isLetterOrDigit(s.charAt(i)) && i < j) {
                i++;
            }
            while (!Character.isLetterOrDigit(s.charAt(j)) && i < j) {
                j--;
            }
            final char left = Character.toLowerCase(s.charAt(i));
            final char right = Character.toLowerCase(s.charAt(j));
            if (left != right) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
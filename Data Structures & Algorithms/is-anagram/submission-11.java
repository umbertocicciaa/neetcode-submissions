class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        final char[] charS = s.toCharArray();
        final char[] charT = t.toCharArray();
        final int leng = s.length();
        Arrays.sort(charS);
        Arrays.sort(charT);
        for (int i = 0; i < leng; i++) {
            if (charS[i] != charT[i]) {
                return false;
            }
        }
        return true;
    }
}

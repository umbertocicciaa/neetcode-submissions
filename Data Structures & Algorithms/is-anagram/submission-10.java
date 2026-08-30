class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }

        final Map<Character, Integer> charactersOfS = new HashMap<>();
        final Map<Character, Integer> charactersOfT = new HashMap<>();

        final int length = s.length();
        final char[] charsS = s.toCharArray();
        final char[] charsT = t.toCharArray();

        for (var i = 0; i < length; i++) {
            char charOfS = charsS[i];
            char charOfT = charsT[i];
            charactersOfS.put(charOfS, charactersOfS.getOrDefault(charOfS, 0) + 1);
            charactersOfT.put(charOfT, charactersOfT.getOrDefault(charOfT, 0) + 1);
        }

        return charactersOfS.equals(charactersOfT);
    }
}

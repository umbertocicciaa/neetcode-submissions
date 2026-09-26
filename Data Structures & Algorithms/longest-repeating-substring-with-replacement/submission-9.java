class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        final Set<Character> characters = new HashSet<>();
        for (var c : s.toCharArray()) {
            characters.add(c);
        }
        for (var c : characters) {
            int l = 0;
            int counter = 0;
            for (var r = 0; r < s.length(); r++) {
                if (s.charAt(r) == c) {
                    counter++;
                }
                while (r - l + 1 - counter > k) {
                    if (s.charAt(l) == c) {
                        counter--;
                    }
                    l++;
                }
                max = Math.max(max, r - l + 1);
            }
        }
        return max;
    }
}

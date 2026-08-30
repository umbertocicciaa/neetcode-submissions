class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null) {
            return new ArrayList<>();
        }

        // anagram of a string -> strings with that anagram
        final Map<String, List<String>> anagramStrings = new HashMap<>();

        for (final String string : strs) {
            int[] counter = new int[26];
            for (char character : string.toCharArray()) {
                counter[character - 'a']++;
            }
            final String key = Arrays.toString(counter);
            anagramStrings.putIfAbsent(key, new ArrayList<>());
            anagramStrings.get(key).add(string);
        }

        return new ArrayList<>(anagramStrings.values());
    }
}

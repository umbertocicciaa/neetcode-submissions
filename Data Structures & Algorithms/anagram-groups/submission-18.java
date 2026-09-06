class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        final List<List<String>> groupAnagram = new ArrayList<>();
        final Map<String, List<String>> frequenciesStrings = new HashMap<>();
        for (String s : strs) {
            int[] frequency = new int[26];
            for (char c : s.toCharArray()) {
                frequency[c - 'a']++;
            }
            final String key = Arrays.toString(frequency);
            if (frequenciesStrings.get(key) == null) {
                frequenciesStrings.put(key, new ArrayList<>());
                frequenciesStrings.get(key).add(s);
            } else {
                frequenciesStrings.get(key).add(s);
            }
        }
        for (final List<String> strings : frequenciesStrings.values()) {
            groupAnagram.add(strings);
        }
        return groupAnagram;
    }
}

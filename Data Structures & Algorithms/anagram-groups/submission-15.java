class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null) {
            return new ArrayList<>();
        }
        final Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            final int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            final String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}

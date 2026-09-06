class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        final Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            final char[] chars = s.toCharArray();
            Arrays.sort(chars);
            final String temp = new String(chars);
            res.putIfAbsent(temp, new ArrayList<>());
            res.get(temp).add(s);
        }
        return new ArrayList<>(res.values());
    }
}

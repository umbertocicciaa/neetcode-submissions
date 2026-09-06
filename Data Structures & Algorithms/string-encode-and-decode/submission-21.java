class Solution {
    public String encode(List<String> strs) {
        final StringBuilder string = new StringBuilder();
        for (final String str : strs) {
            string.append(str.length()).append('#').append(str);
        }
        return string.toString();
    }
    // 4#ciao5#ciao!
    public List<String> decode(String str) {
        final List<String> rs = new ArrayList<>();

        int i = 0;
        int j = i;
        while (i < str.length()) {
            j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            final int len = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + len;
            rs.add(str.substring(i, j));
            i = j;
        }

        return rs;
    }
}

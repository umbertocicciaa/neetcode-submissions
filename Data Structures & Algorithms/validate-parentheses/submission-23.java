class Solution {
    public boolean isValid(String s) {
        final Stack<Character> characters = new Stack<>();
        final Map<Character, Character> mappings = new HashMap<>();
        mappings.put('}', '{');
        mappings.put(']', '[');
        mappings.put(')', '(');

        for (final char c : s.toCharArray()) {
            if (!mappings.containsKey(c)) {
                characters.push(c);
            } else {
                if (characters.size() == 0) {
                    return false;
                }
                if (characters.pop() != mappings.get(c)) {
                    return false;
                }
            }
        }

        return characters.size() == 0;
    }
}

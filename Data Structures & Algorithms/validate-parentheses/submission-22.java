class Solution {
    public boolean isValid(String s) {
        final Stack<Character> stack = new Stack<>();
        final Map<Character, Character> mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put(']', '[');
        mappings.put('}', '{');

        for (Character c : s.toCharArray()) {
            if (!mappings.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                if (stack.pop() != mappings.get(c)) {
                    return false;
                }
            }
        }

        return stack.size() == 0;
    }
}

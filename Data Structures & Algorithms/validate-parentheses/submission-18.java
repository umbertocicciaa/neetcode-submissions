class Solution {
    public boolean isValid(String s) {
        final Stack<Character> stack = new Stack<>();
        final Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (stack.size() == 0) {
                    return false;
                }
                if (stack.pop() != map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.size() == 0;
    }
}

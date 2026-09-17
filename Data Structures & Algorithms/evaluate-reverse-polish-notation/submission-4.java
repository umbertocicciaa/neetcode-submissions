class Solution {
    public int evalRPN(String[] tokens) {
        final var stack = new ArrayDeque<Integer>();
        for (final var token : tokens) {
            if (token.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (token.equals("-")) {
                final var a = stack.pop();
                final var b = stack.pop();
                stack.push(b - a);
            } else if (token.equals("/")) {
                final var a = stack.pop();
                final var b = stack.pop();
                stack.push(b / a);
            } else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}

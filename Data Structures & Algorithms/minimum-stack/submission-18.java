class MinStack {
    final Stack<Integer> stack;
    final Stack<Integer> min;

    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }
    }

    public void pop() {
        int m = stack.pop();
        if (m == min.peek()) {
            min.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

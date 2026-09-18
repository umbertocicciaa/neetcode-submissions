class MinStack {
    final Stack<Integer> numbers;
    final Stack<Integer> minStack;

    public MinStack() {
        numbers = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        numbers.push(val);
        if (minStack.isEmpty() || minStack.peek() >= val) {
            minStack.push(val);
        }
    }

    public void pop() {
        int val = numbers.pop();
        if (val == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return numbers.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
class MinStack {
    private final Deque<Integer> stack;
    private final PriorityQueue<Integer> minHeap;

    public MinStack() {
        stack = new ArrayDeque<>();
        minHeap = new PriorityQueue<>();
    }

    public void push(int val) {
        stack.push(val);
        minHeap.add(val);
    }

    public void pop() {
        int val = stack.pop();
        minHeap.remove(val);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minHeap.peek();
    }
}

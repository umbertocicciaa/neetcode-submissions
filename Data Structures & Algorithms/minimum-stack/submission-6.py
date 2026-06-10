class MinStack:
    def __init__(self):
        self.stack = []

    def push(self, val: int) -> None:
        self.stack.append(val)

    def pop(self) -> None:
        if len(self.stack) < 1:
            raise Exception("Stack is empty")
        self.stack.pop()

    def top(self) -> int:
        if len(self.stack) < 1:
            raise Exception("Stack is empty")
        return self.stack[-1]

    def getMin(self) -> int:
        if len(self.stack) < 1:
            raise Exception("Stack is empty")
        return heapq.nsmallest(1, self.stack)[0]
        
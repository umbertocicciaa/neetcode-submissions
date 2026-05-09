class MinStack:
    def __init__(self):
        self.stack = []

    def push(self, val: int) -> None:
        self.stack.append(val)

    def pop(self) -> None:
        if len(self.stack)>0:
            self.stack.pop()

    def top(self) -> int:
        if len(self.stack)>0:
            return self.stack[-1]
        raise Exception("empty stack")

    def getMin(self) -> int:
        if len(self.stack)>0:
            return min(self.stack)
        raise Exception("empty stack")
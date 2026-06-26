class MinStack:
    def __init__(self):
        self.stack = []

    def push(self, val: int) -> None:
        self.stack.append(val)

    def pop(self) -> None:
        self.checkDimension()
        return self.stack.pop()        

    def top(self) -> int:
        self.checkDimension()
        return self.stack[-1]

    def getMin(self) -> int:
        self.checkDimension()
        return heapq.nsmallest(1, self.stack)[0]
    
    def checkDimension(self):
        if len(self.stack) < 1:
            raise Exception("Stack is empty")

        
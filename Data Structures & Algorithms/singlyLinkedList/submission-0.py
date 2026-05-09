class Node:
    def __init__(self, val=None, nxt=None):
        self.val = val
        self.nxt = nxt

class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    def get(self, index: int) -> int:
        curr = self.head
        i = 0
        while curr:
            if i == index:
                return curr.val
            curr = curr.nxt
            i += 1
        return -1 

    def insertHead(self, val: int) -> None:
        node = Node(val, self.head)
        self.head = node
        if self.tail is None:
            self.tail = node

    def insertTail(self, val: int) -> None:
        node = Node(val)
        if not self.head:
            self.head = self.tail = node
            return
        self.tail.nxt = node
        self.tail = node

    def remove(self, index: int) -> bool:
        if not self.head:
            return False
        
        if index == 0:
            self.head = self.head.nxt
            if not self.head:
                self.tail = None
            return True

        prev = None
        curr = self.head
        i = 0
        while curr:
            if i == index:
                prev.nxt = curr.nxt
                if curr == self.tail:
                    self.tail = prev
                return True
            prev = curr
            curr = curr.nxt
            i += 1
        return False

    def getValues(self) -> list[int]:
        values = []
        curr = self.head
        while curr:
            values.append(curr.val)
            curr = curr.nxt
        return values


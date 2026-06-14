# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        res = ListNode()
        cur = res
        current1 = l1
        current2 = l2
        carry = 0
        while current1 or current2 or carry:
            digit1 = current1.val if current1 else 0
            digit2 = current2.val if current2 else 0
            
            val = digit1 + digit2 + carry
            carry = val // 10
            val = val % 10
            cur.next = ListNode(val)
            
            cur = cur.next
            current1 = current1.next if current1 else None
            current2 = current2.next if current2 else None
        return res.next
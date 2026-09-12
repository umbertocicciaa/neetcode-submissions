class Solution {
    public void reorderList(ListNode head) {
        // middle reverse merge
        var slow = head;
        var fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        var curr = slow.next;
        var prev = slow.next = null;
        while (curr != null) {
            var tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        var first = head;
        var second = prev;
        while (second != null) {
            var temp1 = first.next;
            var temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}
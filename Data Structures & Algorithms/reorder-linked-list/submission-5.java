class Solution {
    public void reorderList(ListNode head) {
        var slow = head;
        var fast = head.next; // with this alghoritm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        var curr = slow.next;
        // slow.next null otherwise we are not disjoint the two lists
        var prev = slow.next = null;
        // reverse
        while (curr != null) {
            var temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        var first = head;
        // start of second list
        var second = prev;
        while (second != null) {
            var temp1 = first.next;
            var temp2 = second.next;
            first.next = second;
            second.next = temp1;
            second = temp2;
            first = temp1;
        }
    }
}
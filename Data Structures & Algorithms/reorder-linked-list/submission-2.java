class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;

        while (curr != null) {
            final ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        ListNode first = head;
        curr = prev;

        while (curr != null) {
            final ListNode temp1 = first.next;
            final ListNode temp2 = curr.next;

            first.next = curr;
            curr.next = temp1;

            first = temp1;
            curr = temp2;
        }
    }
}
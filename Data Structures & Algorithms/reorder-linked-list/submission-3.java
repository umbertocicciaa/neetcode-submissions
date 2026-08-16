class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow.next;
        ListNode prev = null;
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
            ListNode temp1 = curr.next;
            ListNode temp2 = first.next;

            first.next = curr;
            curr.next = temp2;

            first = temp2;
            curr = temp1;
        }
    }
}
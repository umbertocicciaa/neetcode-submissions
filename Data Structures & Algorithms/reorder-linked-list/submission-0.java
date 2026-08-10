class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondList = slow.next;
        slow.next = null;

        ListNode prev = null;

        while (secondList != null) {
            ListNode temp = secondList.next;

            secondList.next = prev;
            prev = secondList;
            secondList = temp;
        }

        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;

            first.next = second;
            second.next = tmp1;

            first = tmp1;
            second = tmp2;
        }
    }
}
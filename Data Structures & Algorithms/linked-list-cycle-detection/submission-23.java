/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        if (head != null && head.next != null)
            return hasCycle(head, head.next.next);

        return false;
    }
    private boolean hasCycle(ListNode slow, ListNode fast) {
        if (fast == null || fast.next == null) {
            return false;
        }
        if (slow == fast)
            return true;
        return hasCycle(slow.next, fast.next.next);
    }
}

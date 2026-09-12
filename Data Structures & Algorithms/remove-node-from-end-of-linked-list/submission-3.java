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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        var left = head;
        var right = head;
        // move r to the node to delete
        for (int i = 1; i <= n; i++) {
            right = right.next;
        }
        // special case head
        if (right == null) {
            return head.next;
        }
        // move l before the node to delete
        while (right.next != null) {
            left = left.next;
            right = right.next;
        }
        // Remove the nth node from the end
        left.next = left.next.next;
        return head;
    }
}
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        var copy = new HashMap<Node, Node>();
        var curr = head;
        while (curr != null) {
            copy.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            var node = copy.get(curr);
            node.next = copy.get(curr.next);
            node.random = copy.get(curr.random);
            curr = curr.next;
        }
        return copy.get(head);
    }
}

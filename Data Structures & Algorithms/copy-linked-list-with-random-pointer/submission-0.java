class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        final Map<Node, Node> nodes = new HashMap<>();

        Node curr = head;

        while (curr != null) {
            nodes.put(curr, new Node(curr.val));
            curr = curr.next;
        }


        curr = head;

        while (curr != null) {
            Node copy = nodes.get(curr);

            copy.next = nodes.get(curr.next);
            copy.random = nodes.get(curr.random);

            curr = curr.next;
        }

        return nodes.get(head);
    }
}
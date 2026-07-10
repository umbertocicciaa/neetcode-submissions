class LinkedList {
    private static final class Node {
        public int value;
        public Node next;
        public Node() {}
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    private Node head;

    public LinkedList() {}

    public int get(int index) {
        Node current = head;
        int current_index = 0;
        while (current != null) {
            if (current_index == index) {
                return current.value;
            }
            current = current.next;
            current_index++;
        }
        return -1;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val, this.head);
        this.head = newNode;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val, null);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public boolean remove(int index) {
        Node prev = null;
        Node current = head;
        int currentIndex = 0;
        while (current != null) {
            if (currentIndex == index) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                return true;
            }
            prev = current;
            current = current.next;
            currentIndex++;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<>();
        Node current = head;
        while (current != null) {
            result.add(current.value);
            current = current.next;
        }
        return result;
    }
}

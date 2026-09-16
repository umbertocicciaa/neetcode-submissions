class Node {
    int key;
    int value;
    Node next;
    Node prev;
    Node(int key, int value) {
        next = null;
        prev = null;
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    final int capacity;
    final Map<Integer, Node> cache;
    final Node left;
    final Node right;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        left = new Node(0, 0);
        right = new Node(0, 0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }

    private void insert(Node node) {
        this.right.prev.next = node;
        node.prev = this.right.prev;
        node.next = this.right;
        this.right.prev = node;
    }

    private void remove(Node node) {
        var prev = node.prev;
        var next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public int get(int key) {
        if (this.cache.containsKey(key)) {
            final var res = this.cache.get(key);
            remove(res);
            insert(res);
            return res.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (this.cache.containsKey(key)) {
            remove(this.cache.get(key));
        }
        final Node newNode = new Node(key, value);
        this.cache.put(key, newNode);
        insert(newNode);
        if (this.cache.size() > this.capacity) {
            Node lru = this.left.next;
            remove(lru);
            this.cache.remove(lru.key);
        }
    }
}

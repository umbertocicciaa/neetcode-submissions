class Node {
    Node prev;
    Node next;
    int key;
    int value;
    Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {
    int capacity;
    final Map<Integer, Node> cache;
    Node left;
    Node right;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.left = new Node(0, 0);
        this.right = new Node(0, 0);
        this.cache = new HashMap<>();
        this.left.next = right;
        this.right.prev = this.left;
    }

    private void remove(Node node) {
        var prev = node.prev;
        var next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void insert(Node node) {
        this.right.prev.next = node;
        node.prev = this.right.prev;
        node.next = this.right;
        this.right.prev = node;
    }

    public int get(int key) {
        if (this.cache.containsKey(key)) {
            var node = this.cache.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (this.cache.containsKey(key)) {
            remove(this.cache.get(key));
        }
        var node = new Node(key, value);
        this.cache.put(key, node);
        insert(node);
        if (this.cache.size() > this.capacity) {
            var lru = this.left.next;
            this.cache.remove(lru.key);
            remove(lru);
        }
    }
}

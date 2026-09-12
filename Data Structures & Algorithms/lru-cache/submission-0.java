class Node {
    Node prev;
    Node next;
    int key;
    int val;
    Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {
    private int capacity;
    private Map<Integer, Node> cache;

    // left least recent used
    Node left;
    Node right;

    // operations on least recent used list
    private void remove(Node node) {
        var prev = node.prev;
        var next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void insert(Node node) {
        Node prev = this.right.prev; // the last is a dummy
        prev.next = node;
        node.prev = prev;
        node.next = this.right;
        this.right.prev = node;
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.left = new Node(0, 0);
        this.right = new Node(0, 0);
        this.cache = new HashMap<>();
        this.left.next = this.right;
        this.right.prev = this.left;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            var res = cache.get(key);
            remove(res);
            insert(res);
            return res.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            remove(cache.get(key));
        }
        var node = new Node(key, value);
        cache.put(key, node);
        insert(node);

        if (cache.size() > this.capacity) {
            Node lru = this.left.next; // the first is a dummy
            remove(lru);
            cache.remove(lru.key);
        }
    }
}

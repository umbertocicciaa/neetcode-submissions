class Node {
    int key;
    int val;
    Node prev;
    Node next;
    Node(int key, int value) {
        this.key = key;
        this.val = value;
        prev = null;
        next = null;
    }
}

class LRUCache {
    Node left;
    Node right;
    final int capacity;
    final Map<Integer, Node> cache = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        left = new Node(0, 0);
        right = new Node(0, 0);
        left.next = right;
        right.prev = left;
    }

    private void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void insert(Node node) {
        Node lru = right.prev;
        lru.next = node;
        node.prev = lru;
        right.prev = node;
        node.next = right;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node res = cache.get(key);
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
        Node node = new Node(key, value);
        insert(node);
        cache.put(key, node);
        if (cache.size() > capacity) {
            Node lru = left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}

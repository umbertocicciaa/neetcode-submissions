
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
    private final int capacity;
    private final Map<Integer, Node> cache;

    private Node left;
    private Node right;

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

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        left = new Node(0, 0);
        right = new Node(0, 0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }

    public int get(int key) {
        if (this.cache.containsKey(key)) {
            var node = this.cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            remove(cache.get(key));
        }
        var node = new Node(key, value);
        this.cache.put(key, node);
        insert(node);
        if (this.cache.size() > this.capacity) {
            var leastRecent = this.left.next; // first is dummy
            this.cache.remove(leastRecent.key);
            remove(leastRecent);
        }
    }
}

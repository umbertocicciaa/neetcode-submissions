class PrefixTree {
    final Node root = new Node();

    private static class Node {
        final Map<Character, Node> characters = new HashMap<>();
        boolean isWord = false;
    }

    public PrefixTree() {}

    public void insert(String word) {
        Node current = root;
        for (var c : word.toCharArray()) {
            if (!current.characters.containsKey(c)) {
                current.characters.put(c, new Node());
            }
            current = current.characters.get(c);
        }
        current.isWord = true;
    }

    public boolean search(String word) {
        Node current = root;
        for (var c : word.toCharArray()) {
            if (!current.characters.containsKey(c)) {
                return false;
            }
            current = current.characters.get(c);
        }
        return current.isWord;
    }

    public boolean startsWith(String prefix) {
        Node current = root;
        for (var c : prefix.toCharArray()) {
            if (!current.characters.containsKey(c)) {
                return false;
            }
            current = current.characters.get(c);
        }
        return true;
    }
}

class PrefixTree {
    private final Node root = new Node();

    private static class Node {
        final Map<Character, Node> children = new HashMap<>();
        boolean isWord = false;
    }

    private static void validateWord(String word) {
        if (word == null || word.isBlank()) {
            throw new IllegalArgumentException("word must not be null or blank");
        }
    }

    private Node findNode(String word) {
        validateWord(word);
        Node curr = this.root;
        for (var c : word.toCharArray()) {
            curr = curr.children.get(c);
            if (curr == null) {
                return null;
            }
        }
        return curr;
    }

    public void insert(String word) {
        Node curr = root;
        for (char c : word.toCharArray()) {
            curr = curr.children.computeIfAbsent(c, k -> new Node());
        }
        curr.isWord = true;
    }

    public boolean search(String word) {
        Node node = findNode(word);
        return node != null && node.isWord;
    }

    public boolean startsWith(String prefix) {
        return findNode(prefix) != null;
    }
}

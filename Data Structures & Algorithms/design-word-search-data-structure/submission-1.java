class WordDictionary {
    private final Dictionary dictionary = new Dictionary();

    private static class Dictionary {
        final Map<Character, Dictionary> words = new HashMap<>();
        boolean isWord = false;
    }

    public void addWord(String word) {
        Dictionary current = dictionary;
        for (var character : word.toCharArray()) {
            current = current.words.computeIfAbsent(character, k -> new Dictionary());
        }
        current.isWord = true;
    }

    public boolean search(String word) {
        return search(word, 0, dictionary);
    }

    private boolean search(String word, int index, Dictionary node) {
        if (index == word.length()) {
            return node.isWord;
        }
        var c = word.charAt(index);
        if (c == '.') {
            for (Dictionary child : node.words.values()) {
                if (search(word, index + 1, child)) {
                    return true;
                }
            }
            return false;
        }
        Dictionary child = node.words.get(c);
        return child != null && search(word, index + 1, child);
    }
}

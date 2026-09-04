class Solution {
    public List<List<Integer>> combine(int n, int k) {
        final List<List<Integer>> combinations = new ArrayList<>();
        generateCombinations(n, k, 1, new ArrayList<>(), combinations);
        return combinations;
    }

    private static void generateCombinations(
        int n, int k, int i, List<Integer> current, List<List<Integer>> combinations) {
        if (current.size() == k) {
            combinations.add(new ArrayList<>(current));
            return;
        }
        if (i > n) {
            return;
        }

        for (int j = i; j <= n; j++) {
            current.add(j);
            generateCombinations(n, k, j + 1, current, combinations);
            current.remove(current.size() - 1);
        }
    }
}
class Solution {
    public boolean validTree(int n, int[][] edges) {
        final List<List<Integer>> adjacency = new ArrayList<>();
        for (int node = 0; node < n; node++) {
            adjacency.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjacency.get(edge[0]).add(edge[1]);
            adjacency.get(edge[1]).add(edge[0]);
        }
        final Set<Integer> visited = new HashSet<>();

        if (!dfs(0, -1, visited, adjacency)) {
            return false;
        }

        return visited.size() == n;
    }

    private static boolean dfs(
        int node, int parent, Set<Integer> visited, List<List<Integer>> adjacency) {
        if (visited.contains(node)) {
            return false;
        }
        visited.add(node);
        for (int adj : adjacency.get(node)) {
            if (adj == parent) {
                continue;
            }
            if (!dfs(adj, node, visited, adjacency)) {
                return false;
            }
        }
        return true;
    }
}

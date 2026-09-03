class Solution {
    public boolean validTree(int n, int[][] edges) {
        final List<List<Integer>> graph = new ArrayList<>();
        for (int node = 0; node < n; node++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        final Set<Integer> visited = new HashSet<>();
        if (!dfs(visited, graph, 0, -1)) {
            return false;
        }
        return visited.size() == n;
    }

    private static boolean dfs(
        Set<Integer> visited, List<List<Integer>> graph, int node, int parent) {
        if (visited.contains(node)) {
            return false;
        }
        visited.add(node);
        for (int adj : graph.get(node)) {
            if (adj == parent) {
                continue;
            }
            if (!dfs(visited, graph, adj, node)) {
                return false;
            }
        }
        return true;
    }
}

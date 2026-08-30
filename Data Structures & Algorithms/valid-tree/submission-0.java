class Solution {
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int node = 0; node < n; node++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        final Set<Integer> visited = new HashSet<>();

        if (!dfs(0, -1, adj, visited)) {
            return false;
        }

        return visited.size() == n;
    }

    private static boolean dfs(
        int node, int parent, List<List<Integer>> adj, Set<Integer> visited) {
        if (visited.contains(node)) {
            // cycle
            return false;
        }
        visited.add(node);
        for (int n : adj.get(node)) {
            if (n == parent) {
                continue;
            }
            if (!dfs(n, node, adj, visited)) {
                return false;
            }
        }
        return true;
    }
}

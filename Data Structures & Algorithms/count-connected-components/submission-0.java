class Solution {
    public int countComponents(int n, int[][] edges) {
        final List<List<Integer>> adj = new ArrayList<>();
        for (int node = 0; node < n; node++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int components = 0;

        final boolean[] visited = new boolean[n];
        for (int node = 0; node < n; node++) {
            if (!visited[node]) {
                dfs(adj, visited, node);
                components++;
            }
        }

        return components;
    }

    private void dfs(List<List<Integer>> adj, boolean[] visit, int node) {
        visit[node] = true;
        for (int nei : adj.get(node)) {
            if (!visit[nei]) {
                dfs(adj, visit, nei);
            }
        }
    }
}

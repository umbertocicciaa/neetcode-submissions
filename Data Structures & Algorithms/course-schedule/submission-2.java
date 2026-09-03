class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        final List<List<Integer>> graph = new ArrayList<>();
        for (int node = 0; node < numCourses; node++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            graph.get(edge[1]).add(edge[0]);
        }
        // 0 = unvisited, 1 = in current DFS path, 2 = fully done
        final int[] stackState = new int[numCourses];
        for (int node = 0; node < numCourses; node++) {
            if (!dfs(node, stackState, graph)) {
                return false;
            }
        }
        return true;
    }

    private static boolean dfs(int node, int[] stackState, List<List<Integer>> graph) {
        if (stackState[node] == 1) {
            return false;
        }
        if (stackState[node] == 2) {
            return true;
        }
        stackState[node] = 1;
        for (int adj : graph.get(node)) {
            if (!dfs(adj, stackState, graph)) {
                return false;
            }
        }
        stackState[node] = 2;
        return true;
    }
}

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        final List<List<Integer>> adjacency = new ArrayList<>();
        for (int node = 0; node < numCourses; node++) {
            adjacency.add(new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            adjacency.get(edge[1]).add(edge[0]);
        }
        final int[] state = new int[numCourses];
        // 0 = unvisited, 1 = in current DFS path, 2 = fully done
        for (int node = 0; node < numCourses; node++) {
            if (!dfs(node, state, adjacency)) {
                return false;
            }
        }
        return true;
    }

    private static boolean dfs(int node, int[] state, List<List<Integer>> adjacency) {
        if (state[node] == 1) {
            return false;
        }
        if (state[node] == 2) {
            return true;
        }
        state[node] = 1;
        for (int n : adjacency.get(node)) {
            if (!dfs(n, state, adjacency)) {
                return false;
            }
        }
        state[node] = 2;
        return true;
    }
}

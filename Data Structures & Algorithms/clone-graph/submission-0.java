/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        final Map<Node, Node> cloned = new HashMap<>();
        return dfs(node, cloned);
    }

    private Node dfs(Node node, Map<Node, Node> cloned) {
        if (node == null) {
            return null;
        }
        if (cloned.containsKey(node)) {
            return cloned.get(node);
        }
        final Node clone = new Node(node.val);
        cloned.put(node, clone);
        for (Node adj : node.neighbors) {
            clone.neighbors.add(dfs(adj, cloned));
        }
        return clone;
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        final List<List<Integer>> result = new ArrayList<>();
        final Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        while (!nodes.isEmpty()) {
            final List<Integer> level = new ArrayList<>();
            for (int i = nodes.size(); i > 0; i--) {
                TreeNode node = nodes.poll();
                if (node != null) {
                    level.add(node.val);
                    nodes.offer(node.left);
                    nodes.offer(node.right);
                }
            }
            if (level.size() > 0) {
                result.add(level);
            }
        }
        return result;
    }
}

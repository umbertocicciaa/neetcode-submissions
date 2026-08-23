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
    public List<Integer> rightSideView(TreeNode root) {
        final Queue<TreeNode> nodes = new LinkedList<>();
        final List<Integer> rightSideNodes = new ArrayList<>();

        nodes.offer(root);
        boolean inserted = false;
        while (!nodes.isEmpty()) {
            inserted = false;
            for (int i = nodes.size(); i > 0; i--) {
                TreeNode node = nodes.poll();
                if (!inserted && node != null) {
                    rightSideNodes.add(node.val);
                    inserted = true;
                }
                if (node != null) {
                    nodes.offer(node.right);
                    nodes.offer(node.left);
                }
            }
        }
        return rightSideNodes;
    }
}

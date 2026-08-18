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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> order = new ArrayList<>();
        inOrder(root, order);
        int[] orderArray = order.stream().mapToInt(Integer::intValue).toArray();
        return orderArray[k - 1];
    }
    private static void inOrder(TreeNode root, List<Integer> order) {
        if (root == null) {
            return;
        }
        inOrder(root.left, order);
        order.add(root.val);
        inOrder(root.right, order);
    }
}

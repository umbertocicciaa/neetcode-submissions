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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPath(root, targetSum, 0);
    }
    private static boolean hasPath(TreeNode root, int sum, int current) {
        if (root == null) {
            return false;
        }
        current = current += root.val;
        if (root.left == null && root.right == null && current == sum) {
            return true;
        }
        if (hasPath(root.left, sum, current)) {
            return true;
        }
        if (hasPath(root.right, sum, current)) {
            return true;
        }
        current -= root.val;
        return false;
    }
}
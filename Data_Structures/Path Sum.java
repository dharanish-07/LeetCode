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
        return sum(root, targetSum, 0);
    }

    boolean sum(TreeNode root, int target, int sum) {
        if (root == null)
            return false;
        sum += root.val;
        if (root.left == null && root.right == null) {
            return target == sum;
        }
        if (sum(root.left, target, sum))
            return true;
        if (sum(root.right, target, sum))
            return true;
        return false;
    }
}

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
    long min = Long.MAX_VALUE, sec = Long.MAX_VALUE;

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null)
            return 0;
        if (min > root.val) {
            sec = min;
            min = root.val;
        } else if (min < root.val && sec > root.val) {
            sec = root.val;
        }
        findSecondMinimumValue(root.left);
        findSecondMinimumValue(root.right);
        return sec == Long.MAX_VALUE ? -1 : (int) sec;
    }
}

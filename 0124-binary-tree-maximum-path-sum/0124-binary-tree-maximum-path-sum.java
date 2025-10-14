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

    private int pathsum(TreeNode root, int maxValue[]){
        if(root == null)
        return 0;
        int left = Math.max(0,pathsum(root.left, maxValue));
        int right = Math.max(0,pathsum(root.right, maxValue));
        maxValue[0] = Math.max(maxValue[0], left+right+root.val);
        return root.val + Math.max(left, right);
    } 
    public int maxPathSum(TreeNode root) {
        int maxValue[] = new int[]{Integer.MIN_VALUE};
        pathsum(root, maxValue);
        return maxValue[0];
    }
}
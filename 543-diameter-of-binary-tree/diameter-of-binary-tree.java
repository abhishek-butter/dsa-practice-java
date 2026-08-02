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
    int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
        back(root);
        return d;
        
    }
    public int back(TreeNode root){
        if(root==null)return 0;
        int left=back(root.left);
        int right=back(root.right);
        d=Math.max(right+left,d);
        return 1+Math.max(right,left);


    }
}
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

    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max=0;
        checker(root);

        return max;
        
    }


    public int checker(TreeNode root){
        if(root==null){
            return 0;
        }

        int leftDepth=checker(root.left);
        int rightDepth=checker(root.right);
        
        max=Math.max(max,leftDepth+rightDepth);

        return 1+Math.max(leftDepth,rightDepth);



    }
}
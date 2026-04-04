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
    int maxdepth;
    public int diameterOfBinaryTree(TreeNode root) {
        
        finder(root);
        return maxdepth;
        
        
    }
    public int  finder(TreeNode root){
        if(root==null){
            return 0;
        }

        int leftDepth=finder(root.left);
        int rightDepth=finder(root.right);

        maxdepth=Math.max(maxdepth,leftDepth+rightDepth);


        return 1+ Math.max(leftDepth,rightDepth);
       

        


       
    }
}
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
    List<Integer> l;
    public List<Integer> inorderTraversal(TreeNode root) {
        l=new ArrayList<>();
        inorder(root);
        return l;

        
    }
    public void inorder(TreeNode r){
        if(r==null)return;

        inorder(r.left);

        l.add(r.val);

        inorder(r.right);

        
    }
}
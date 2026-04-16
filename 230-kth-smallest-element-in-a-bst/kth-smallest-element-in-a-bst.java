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
    
    public int kthSmallest(TreeNode root, int k) {
        l=new ArrayList<>();
        inorder(root);
        return l.get(k-1);

        
    }
    public TreeNode inorder(TreeNode root){
        if(root==null)return root;
        if(root.left!=null)inorder(root.left);
        l.add(root.val);
        if(root.right!=null)inorder(root.right);
        return root;
    }
}
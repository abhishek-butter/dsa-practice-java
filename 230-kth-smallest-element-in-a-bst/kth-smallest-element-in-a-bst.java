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
    int count=0;
    int found=-1;
    
    public int kthSmallest(TreeNode root, int k) {
        l=new ArrayList<>();
        inorder(root,k);
        return found;

        
    }
    public void inorder(TreeNode root,int k){
        if(root==null||found!=-1)return ;
        inorder(root.left,k);
        count++;
        if(count==k){
            found=root.val;
            return;
        }

        l.add(root.val);
        inorder(root.right,k);
        
    }
}
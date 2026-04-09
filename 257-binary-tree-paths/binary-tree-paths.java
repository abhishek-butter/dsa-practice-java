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
    List<String> l;
    public List<String> binaryTreePaths(TreeNode root) {
        l=new ArrayList<>();
        paths(root,new StringBuilder());

        return l;


        
    }
    public void paths(TreeNode root,StringBuilder s){
        int len=s.length();
        s.append(root.val);
        if(root.right==null && root.left==null){
            
            l.add(s.toString());
            

        }
        else{
            s.append("->");
            if(root.left!=null)paths(root.left,s);
            if(root.right!=null)paths(root.right,s);

        }

        
        
        s.setLength(len);

    }
}
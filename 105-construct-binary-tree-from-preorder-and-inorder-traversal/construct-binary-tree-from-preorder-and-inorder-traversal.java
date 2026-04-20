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
    int index=0;

    HashMap<Integer,Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map=new HashMap<>();

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);

        }
        return create(preorder,0,preorder.length-1);

        
    }
    public TreeNode create(int[] p,int left,int right){

        if(left>right){
            return null;
        }
        int val=p[index++];
        TreeNode root=new TreeNode(val);


        root.left=create(p,left,map.get(val)-1);
        root.right=create(p,map.get(val)+1,right);
        

        return root;
    }

}
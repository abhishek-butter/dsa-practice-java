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
    int pi=0;
    HashMap<Integer,Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map=new HashMap<>();

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);


        }
        
        return construct(preorder,0,inorder.length-1);
        
        
    }
    public TreeNode construct(int[] preorder,int leftrange,int rightrange){
        if(leftrange>rightrange){
            return null;
        }

        int value=preorder[pi++];
        TreeNode root =new TreeNode(value);

        root.left=construct(preorder,leftrange,map.get(value)-1);
        root.right=construct(preorder,map.get(value)+1,rightrange);
        
        return root;
    }
    

}
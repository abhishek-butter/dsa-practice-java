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
    public int findBottomLeftValue(TreeNode root) {
        int top=0;
        if(root==null)return top;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();

            for(int i=0;i<s;i++){
                TreeNode t=q.poll();

                if(i==0){
                    top=t.val;
                }

                if(t.left!=null)q.add(t.left);
                if(t.right!=null)q.add(t.right);
            }


        }
        return top;
        
    }
}
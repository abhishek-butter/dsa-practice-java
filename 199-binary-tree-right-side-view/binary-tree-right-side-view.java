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
    public List<Integer> rightSideView(TreeNode root) {
        

        List<Integer> l=new ArrayList<>();
        if(root==null)return l;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){

            
            int s=q.size();
            int i=0;
            while(i<s){
                TreeNode temp=q.poll();

                if(i==s-1){
                    l.add(temp.val);
                }

                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
                i++;
            }

            
        }
        return l;

        
    }
}
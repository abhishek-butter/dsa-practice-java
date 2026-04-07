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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean d=true;
        List<List<Integer>> l=new ArrayList<>();
        if(root==null)return l;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int s=q.size();
            LinkedList<Integer> cl=new LinkedList<>();
            for(int i=0;i<s;i++){
                TreeNode t=q.poll();
                
                if(d){
                    if(t.left!=null)q.add(t.left);
                    if(t.right!=null)q.add(t.right);
                    cl.addLast(t.val);

                }
                else{
                    if(t.left!=null)q.add(t.left);
                    if(t.right!=null)q.add(t.right);
                    
                    cl.addFirst(t.val);

                }
            }
            d=!d;
            l.add(cl);
            


        }
        return l;
        
    }
}
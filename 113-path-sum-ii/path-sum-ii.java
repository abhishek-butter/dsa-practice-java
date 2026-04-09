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
    List<List<Integer>> l;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        l=new ArrayList<>();
        DFS(root,targetSum,new ArrayList<>());
        return l;
    }
    public void DFS(TreeNode root,int t,List<Integer> pocket){
        if(root==null)return;
        pocket.add(root.val);
        if(root.right==null && root.left==null && t==root.val){
            l.add(new ArrayList<>(pocket));

        }
        else{
            if(root.left!=null)DFS(root.left,t-root.val,pocket);
            if(root.right!=null)DFS(root.right,t-root.val,pocket);

        }

        pocket.remove(pocket.size()-1);
    }
}
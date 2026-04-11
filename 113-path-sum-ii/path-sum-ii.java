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
        if(root==null)return l;
        path(root,targetSum,new ArrayList<>());

        return l;
        
    }

    public void path(TreeNode root,int t,List<Integer> pocket){
        pocket.add(root.val);
        if(root.left==null&&root.right==null&&root.val==t){
            l.add(new ArrayList<>(pocket));

        }

        if(root.left!=null)path(root.left,t-root.val,pocket);
        if(root.right!=null)path(root.right,t-root.val,pocket);

        pocket.remove(pocket.size()-1);
    }
}   

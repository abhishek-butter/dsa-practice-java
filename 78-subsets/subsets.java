class Solution {
    List<List<Integer>> l;
    public List<List<Integer>> subsets(int[] nums) {
        l=new ArrayList<>();
        recursion(0,nums,new ArrayList<>());
        return l;
        
    }
    public void recursion(int i,int[] n,List<Integer> pocket){
        if(i==n.length){
            l.add(new ArrayList(pocket));

            return;
        }
        pocket.add(n[i]);
        recursion(i+1,n,pocket);
        pocket.remove(pocket.size()-1);
        recursion(i+1,n,pocket);
    }
}
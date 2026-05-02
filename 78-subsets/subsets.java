class Solution {
    List<List<Integer>> l;

    public List<List<Integer>> subsets(int[] nums) {
        l=new ArrayList<>();
        rec(0,nums,new ArrayList<>());
        return l;


        
    }

    public void rec(int index,int n[],List<Integer> pocket){
        if(index==n.length){
            l.add(new ArrayList<>(pocket));
            return;
        }
        pocket.add(n[index]);
        rec(index+1,n,pocket);
        pocket.remove(pocket.size()-1);
        rec(index+1,n,pocket);
        return;
    }
}
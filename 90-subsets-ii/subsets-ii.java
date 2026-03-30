class Solution {
    List<List<Integer>> l;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        l=new ArrayList<>();
        Arrays.sort(nums);
        

        backtrack(0,nums,new ArrayList<>());

        return l;


        
    }
    public void backtrack(int i,int[] n,List<Integer> pocket){
        if(i==n.length){
            l.add(new ArrayList<>(pocket));
            return;
        }
        pocket.add(n[i]);
        backtrack(i+1,n,pocket);
        pocket.remove(pocket.size()-1);
        while(i+1<n.length && n[i]==n[i+1]){i++;}
        backtrack(i+1,n,pocket);
        

       

    }
}
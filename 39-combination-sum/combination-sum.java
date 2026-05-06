class Solution {
    List<List<Integer>> l;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        l=new ArrayList<>();
        rec(0,candidates,target,new ArrayList<>());

        return l;
        
    }
    public void rec(int a,int[] c,int s,List<Integer> pocket){
        if(s==0){
            l.add(new ArrayList<>(pocket));
            return;
        }
        if(s<0){
            return;
        }
        for(int i=a;i<c.length;i++){
            pocket.add(c[i]);
            rec(i,c,s-c[i],pocket);
            pocket.remove(pocket.size()-1);
        }
    }
}
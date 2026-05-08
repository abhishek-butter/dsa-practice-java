class Solution {
    List<List<Integer>> l;
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        l=new ArrayList<>();
        
        Arrays.sort(candidates);
        rec(0,candidates,target,new ArrayList<>());


        return l;
    
    
    }   
    public void rec(int i,int[] n,int t,List<Integer> pocket){
        if(t==0){
            l.add(new ArrayList<>(pocket));
            return;
        }
        if(i==n.length || t<0){
            return;
        }
        for(int s=i;s<n.length;s++){
            if(s>i && n[s-1]==n[s])continue;
            

            
            pocket.add(n[s]);
            
            
            rec(s+1,n,t-n[s],pocket);
            pocket.remove(pocket.size()-1);
            

        }


    }

}
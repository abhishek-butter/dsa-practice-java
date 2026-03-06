class Solution {
    List<List<Integer>> l;
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        l=new ArrayList<>();
        recursion(candidates,0,target,new ArrayList<>());
        return l;
        
    }
    public void recursion(int[] candidates,int index,int target,List<Integer> pocket){
        if(target==0){
            l.add(new ArrayList<>(pocket));
            return;
        }


        if(target<0||index==candidates.length){
            return;
        }

        pocket.add(candidates[index]);
        recursion(candidates,index,target-candidates[index],pocket);

        pocket.remove(pocket.size()-1);
        recursion(candidates,index+1,target,pocket);
    
    }
}
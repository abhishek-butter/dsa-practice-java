class Solution {
    List<List<Integer>> l;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        l=new ArrayList<>();
        Arrays.sort(candidates);

        recursion(0,candidates,target,new ArrayList<>());
        return l;
        
    }

    public void recursion(int i,int[] c,int sum,List<Integer> pocket){
        if(sum==0){
            l.add(new ArrayList<>(pocket));
            return;
        }
        if(i==c.length ||sum<0){
            return;

        }
        pocket.add(c[i]);
        recursion(i+1,c,sum-c[i],pocket);

        while(i+1<c.length && c[i]==c[i+1]){
            i++;
        }
        pocket.remove(pocket.size()-1);
        recursion(i+1,c,sum,pocket);





    }
}
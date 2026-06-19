class Solution {
    boolean[] check;
    List<List<Integer>> l;
    public List<List<Integer>> permute(int[] nums) {
        check=new boolean[128];
        l=new ArrayList<>();
        rec(nums,new ArrayList<>());
        return l;
    }
    public void rec(int[] nums,List<Integer> pocket){
        if(pocket.size()==nums.length){
            l.add(new ArrayList<>(pocket));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(check[i])continue;
            check[i]=true;
            pocket.add(nums[i]);
            rec(nums,pocket);
            pocket.remove(pocket.size()-1);
            check[i]=false;
        }
    }
}
class Solution {
    List<List<Integer>> l;
    public List<List<Integer>> permute(int[] nums) {
        l=new ArrayList<>();
        boolean checker[]=new boolean[21];
        recursion(nums,checker,new ArrayList<>());
        return l;
    }
    public void recursion(int nums[],boolean check[],List<Integer> pocket){
        if(pocket.size()==nums.length){
            l.add(new ArrayList<>(pocket));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(check[i])continue;

            check[i]=true;
            pocket.add(nums[i]);

            recursion(nums,check,pocket);

            check[i]=false;
            pocket.remove(pocket.size()-1);
        }
    }
}
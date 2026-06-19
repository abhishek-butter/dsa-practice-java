class Solution {
    List<List<Integer>> l;
    public List<List<Integer>> subsets(int[] nums) {
        l=new ArrayList<>();
        rec(nums,0,new ArrayList<>());
        return l;
    
        
    }
    public void rec(int[] nums,int i,List<Integer> pocket){
        if(i==nums.length){
            l.add(new ArrayList<>(pocket));
            return;
        }
        pocket.add(nums[i]);
        rec(nums,i+1,pocket);
        pocket.remove(pocket.size()-1);
        rec(nums,i+1,pocket);
    }
}
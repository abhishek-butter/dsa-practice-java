class Solution {
    HashSet<List<Integer>> set;
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        set=new HashSet<>();
        Arrays.sort(nums);
        recursion(nums,0,new ArrayList<>());
        List<List<Integer>> result=new ArrayList<>(set);
        return result;
        
    }
    public void recursion(int nums[],int index,List<Integer> pocket){
        if(index==nums.length){
            set.add(new ArrayList<>(pocket));
            return;
        }


        pocket.add(nums[index]);
        recursion(nums,index+1,pocket); 
        pocket.remove(pocket.size()-1);
        recursion(nums,index+1,pocket);
        
    }
}
class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        result=new ArrayList<>();
        Arrays.sort(candidates);
        recursion(candidates,target,0,new ArrayList<>());
        return result;

        
    }
    public void recursion(int[] nums,int target,int index,List<Integer> pocket){
        if(target==0){
            result.add(new ArrayList<>(pocket));
            return;
        }
        if(target<0 || index==nums.length){
            return;
        }
        pocket.add(nums[index]);
        recursion(nums,target-nums[index],index+1,pocket);
        pocket.remove(pocket.size()-1);
        while(index+1<nums.length && nums[index]==nums[index+1]){
            index++;
        }
        recursion(nums,target,index+1,pocket);
    }
}
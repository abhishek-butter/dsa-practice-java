class Solution {
    List<List<Integer>> l;
    public List<List<Integer>> subsets(int[] nums) {
        l=new ArrayList<>();
        recursion(nums,0,new ArrayList<>());

        return l;


        
    }
    public void  recursion(int nums[],int index,List<Integer> subarray){
        if(index==nums.length){
            l.add(new ArrayList<>(subarray));
            return;
        }
        subarray.add(nums[index]);
        recursion(nums,index+1,subarray);

        subarray.remove(subarray.size()-1);
        recursion(nums,index+1,subarray);

        
    }
}
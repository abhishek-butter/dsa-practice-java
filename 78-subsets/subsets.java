class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        recurs(nums,0,new ArrayList<>(),l);
        return l;
        
    }
    public void recurs(int[] nums,int k,List<Integer> result,List<List<Integer>> l ){
        if(k==nums.length){
            l.add(new ArrayList<>(result));
            return;
        }

        result.add(nums[k]);
        recurs(nums,k+1,result,l);

        result.remove(result.size()-1);
        recurs(nums,k+1,result,l);
    }
}
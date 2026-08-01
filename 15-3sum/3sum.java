class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                
                if(sum==0){
                    l.add(List.of(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left!=nums.length-1 && nums[left-1]==nums[left]){
                        left++;
                    }
                    while(right!=0 && nums[right+1]==nums[right]){
                        right--;
                    }
    
                }
                else if(sum>0){
                    right--;
                    continue;
                }
                else {
                    left++;
                    continue;
                }
                while(i!=nums.length-2 && nums[i+1]==nums[i])i++;
                
            }
           
        }
        return l;
        
    }
}
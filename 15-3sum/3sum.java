class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int l=i+1;
            int r=nums.length-1;
            if(i>0 && nums[i]==nums[i-1])continue;
            while(l<r){
               
                
                
                int s=nums[i]+nums[l]+nums[r];
                if(s>0)r--;
                else if(s<0)l++;
                else {
                    li.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<nums.length-1 && l>0 && nums[l]==nums[l-1])l++;
                    while(r>0 && r<nums.length-1 && nums[r]==nums[r+1])r--;
                    
                }
                
            }
        }
        return li;
        
    }
}
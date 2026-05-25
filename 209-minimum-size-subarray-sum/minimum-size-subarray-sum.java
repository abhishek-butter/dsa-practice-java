class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        long sum=0;
        int min=99999999;
        boolean found=false;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(target<=sum){
                min=Math.min(min,i-left+1);
                found=true;
                
                sum=sum-nums[left];
                left++;
            }

            
        }
        return (found)?min:0;
        
    }
}
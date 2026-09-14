class Solution {
    
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        return Math.max(helper(nums,0,nums.length-1),helper(nums,1,nums.length));
        
    }
    public int helper(int[] nums,int start,int end){
        int rob1=0;
        int rob2=0;
        int max=0;
        
        while(start<end){
            int temp=Math.max(rob1+nums[start],rob2);

            rob1=rob2;
            rob2=temp;
            start++;
        }
        return rob2;
    }
}
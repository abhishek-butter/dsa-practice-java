class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[]=new int[nums.length];
        int p=1;
        int s=1;
        for(int i=0;i<nums.length;i++){
            result[i]=p;
            p*=nums[i];

        }
        for(int i=nums.length-1;i>-1;i--){
            result[i]*=s;
            s*=nums[i];

        }
        return result;
        
    }
}
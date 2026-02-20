class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxsum=Double.NEGATIVE_INFINITY;
        double sum=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
            
            if(i-l+1==k){
                maxsum=Math.max(sum,maxsum);
                
                sum=sum-nums[l];
                l++;
            }
            
        }
        return maxsum/k;
        
    }
}
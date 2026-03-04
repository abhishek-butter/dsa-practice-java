class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return counter(nums,k)-counter(nums,k-1);
        

    }
    public int counter(int[] nums,int k){
        if(k<0)return 0;
        int left=0;
        
        int count=0;
        
        for(int right=0;right<nums.length;right++){
            
            if(nums[right]%2==1)k--;
            
            while(k<0){
                if(nums[left]%2==1){
                    k++;
                    
                }
                left++;
            }
            count+=right-left+1;
            

        }
        return count;
    }
        
} 
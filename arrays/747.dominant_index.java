// Problem: Largest Number At Least Twice of Others
// Approach:
// 1. Find maximum element and its index
// 2. Check if max >= 2 * every other element
// Time: O(n), Space: O(1)


class Solution {
    public int dominantIndex(int[] nums) {
        
        int max=nums[0];
        int j=0;
        for( int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                j=i;
            }
           

        }
        for(int i=0;i<nums.length;i++){
            if((i!=j) &&(max<2*nums[i])){
                return -1;

            }

        }
        
        
        return j;
    }
        
        
    
}

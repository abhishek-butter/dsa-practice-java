
/*
2441.Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists in the array.

Return the positive integer k. If there is no such integer, return -1.

Example :

Input: nums = [-1,2,-3,3]
Output: 3
Explanation: 3 is the only valid k we can find in the array.

Approach:
sort the array using inbuilt sorting function and then use two pointers pointing to the startign and ending values of arrays
and loop until they crossover to fins if at any instance while looping we get the same value in negative on the left right that is
(value on right=negative of value on left) if so return it if nothing is found throughout the looping return -1,
also if the right is <=0  directly return -1 because we need the negative of the max value so a array wiht no positive numbers automatically fails this 


*/





class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int right=nums.length-1;
        int left=0;
        
        while (left<right){
            int m=nums[right];
            if(nums[right]<=0)return -1;
            if(m==-nums[left] ){
                return m;
            
            }
            else if(m>Math.abs(nums[left])){
                right--;
            }
            else{
                left++;
            }

        }
        return -1;
        
        
        
    }
}

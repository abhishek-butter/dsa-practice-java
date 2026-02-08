/*
Given an array of integers nums and an integer k, an element nums[i] is considered good 
if it is strictly greater than the elements at indices i - k and i + k (if those indices exist). 
If neither of these indices exists, nums[i] is still considered good.

Return the sum of all the good elements in the array.

 

Example 1:

Input: nums = [1,3,2,1,5,4], k = 2

Output: 12

Explanation:

The good numbers are nums[1] = 3, nums[4] = 5, and nums[5] = 4 because they are strictly greater than the numbers at indices i - k and i + k.

Example 2:

Input: nums = [2,1], k = 1

Output: 2

Explanation:

The only good number is nums[0] = 2 because it is strictly greater than nums[1].


Aprroach:
initialize the variable u are selecting as true or 1 and then go forwrd and check if 
its lesser than its right conditional area or left conditional area if so
mark the initialized variable as 0 or false and when the iteration is about to end
check the initialized variable  if its true or 1 add the element if not just continue
*/



class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        int l=nums.length;

        for(int i=0;i<nums.length;i++){
            int b=1;
            if((i+k)<l && nums[i]<=nums[i+k])b=0;
            else if((i-k)>=0 && nums[i]<=nums[i-k])b=0;
            
            if(b==1){
                sum+=nums[i];
            }
           
           
           
           
        }
        return sum;
    }
}

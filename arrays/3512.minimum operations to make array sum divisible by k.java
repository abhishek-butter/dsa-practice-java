/*
question:
You are given an integer array nums and an integer k. You can perform the following operation any number of times:

Select an index i and replace nums[i] with nums[i] - 1.
Return the minimum number of operations required to make the sum of the array divisible by k.

 

Example 1:

Input: nums = [3,9,7], k = 5

Output: 4

Explanation:

Perform 4 operations on nums[1] = 9. Now, nums = [3, 5, 7].
The sum is 15, which is divisible by 5.
Example 2:

Input: nums = [4,1,3], k = 4

Output: 0

Explanation:

The sum is 8, which is already divisible by 4. Hence, no operations are needed.
Example 3:

Input: nums = [3,2], k = 6

Output: 5

Explanation:

Perform 3 operations on nums[0] = 3 and 2 operations on nums[1] = 2. Now, nums = [0, 0].
The sum is 0, which is divisible by 6.


approach:
since we know that the problem is essiantially counting how many times the array's any element needs to be subracted by 1 to get the sum of array to be divisible by k ,
we can infer that we need to subract the excess no. of times the excess here is the reminder after dividng the current sum by k so when the reminded is 0 return 0 since no operation is needed ,if reminded >0 return the reminder ,
if sum itself iss ;lesser than 0 the only way to make it divisible is by making it =0 so return sum cuz we need to do sum no. of subraction by 1 operaation to the elements one by one

Time complexity-O(n)
*/





class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int n:nums){
            sum+=n;

        }
        int ex=sum%k;
        if(sum>k){
            return ex;

        }
        else if(sum==k){
            return 0;
        }
        else{
            return sum;
        }
        
        
    }
}

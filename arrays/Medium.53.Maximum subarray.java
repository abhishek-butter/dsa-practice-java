/*

Maximum Subarray — Java Solution (Kadane’s Algorithm)

Problem:
Given an integer array nums, find the contiguous subarray with the largest sum,
and return its sum.

Approach:
This solution uses Kadane’s Algorithm, which tracks a running sum while traversing the array.

Key Insight:
If the running sum becomes negative, it will reduce the sum of any future subarray,
so we reset it to 0 and start fresh.

Steps:
1. Initialize curs (current sum) to 0.
2. Initialize maxs (maximum sum) to a very small value.
3. Traverse the array.
4. Add current element to curs.
5. Update maxs if curs is greater.
6. If curs becomes negative, reset curs to 0.
7. Return maxs.

Time Complexity: O(n)
Space Complexity: O(1)

Java Code:

*/
class Solution {

    public int maxSubArray(int[] nums) {

        int maxs = -10000;
        int curs = 0;

        for(int i = 0; i < nums.length; i++){

            curs += nums[i];

            maxs = Math.max(curs, maxs);

            if(curs < 0)
                curs = 0;
        }

        return maxs;
    }
}

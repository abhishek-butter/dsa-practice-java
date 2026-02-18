/*
Product of Array Except Self — Java Solution (Prefix and Suffix Product Approach)

Problem:
Given an integer array nums, return an array answer such that answer[i]
is equal to the product of all elements of nums except nums[i].

You must solve it without using division and in O(n) time complexity.

Approach:
This solution uses prefix and suffix products to compute the result efficiently.

Key Insight:
For each index i:
answer[i] = product of all elements to the left × product of all elements to the right

Steps:
1. Initialize pf (prefix product) = 1.
2. Traverse from left to right:
   • Store prefix product in result array.
   • Update prefix product by multiplying current element.
3. Initialize sf (suffix product) = 1.
4. Traverse from right to left:
   • Multiply suffix product with result array.
   • Update suffix product by multiplying current element.
5. Return result array.

Time Complexity: O(n)
Space Complexity: O(1) (excluding output array)

Java Code:

*/
class Solution {

    public int[] productExceptSelf(int[] nums) {

        int pf = 1;
        int sf = 1;

        int[] a = new int[nums.length];

        // Prefix product pass
        for(int i = 0; i < nums.length; i++){
            a[i] = pf;
            pf *= nums[i];
        }

        // Suffix product pass
        for(int i = nums.length - 1; i > -1; i--){
            a[i] *= sf;
            sf *= nums[i];
        }

        return a;
    }
}

/*
 Problem Statement:

An array is monotonic if it is either entirely non-increasing or non-decreasing.

Given an integer array nums, return true if the array is monotonic, otherwise return false.

 Approach:

We track two conditions:

increasing → Checks if array is non-decreasing

decreasing → Checks if array is non-increasing

 Logic:

Traverse the array once.

Compare each element with its previous element.

If nums[i] > nums[i-1] → It cannot be decreasing.

If nums[i] < nums[i-1] → It cannot be increasing.

If both become false → array is not monotonic.

⏱ Complexity

Time Complexity: O(n)

Space Complexity: O(1)


*/
class Solution {
    public boolean isMonotonic(int[] nums) {

        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] > nums[i - 1]) {
                decreasing = false;
            }

            if(nums[i] < nums[i - 1]) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }
}

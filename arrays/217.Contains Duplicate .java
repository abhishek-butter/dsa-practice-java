/*
Contains Duplicate — Java Solution (Sorting Approach)

Problem:
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Approach:
This solution uses sorting to detect duplicates efficiently.

Key Insight:
If the array is sorted, duplicate elements will always appear next to each other.

Steps:
1. Sort the array using Arrays.sort().
2. Traverse the array from index 1 to end.
3. Compare each element with its previous element.
4. If two adjacent elements are equal, a duplicate exists → return true.
5. If no duplicates are found, return false.

Time Complexity: O(n log n)
- Sorting takes O(n log n)
- Traversal takes O(n)

Space Complexity: O(1)
- No extra data structures used (in-place comparison)

Java Code:
*/
import java.util.Arrays;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == prev) {
                return true;
            }

            prev = nums[i];
        }

        return false;
    }
}

/*🟢 27. Remove Element
📘 Problem Statement

You are given an integer array nums and an integer val.
Remove all occurrences of val from nums in-place.

The order of elements may be changed.
Return the number of elements in nums that are not equal to val.

After returning k, the first k elements of nums should contain the elements that are not equal to val.
The remaining elements of nums are not important.

🧠 Approach (Two Pointer Technique)

We use a pointer k to track the position where the next valid element (not equal to val) should be placed.

Traverse the array using index i.

Whenever nums[i] is not equal to val, copy it to nums[k] and increment k.

This overwrites unwanted elements and keeps all valid elements in the front of the array.

Finally, return k, which represents the count of elements not equal to val.

This approach modifies the array in-place and uses constant extra space.

💻 Code
  */
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

⏱️ Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(1)

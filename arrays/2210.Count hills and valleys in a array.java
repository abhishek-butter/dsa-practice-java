/*
Here’s the clean GitHub copy-pastable version in your usual format.

2210. Count Hills and Valleys in an Array
Problem Statement

Given a 0-indexed integer array nums, an index i is:

A hill if its closest non-equal neighbors on both sides are smaller than nums[i].

A valley if its closest non-equal neighbors on both sides are greater than nums[i].

Return the total number of hills and valleys in the array.

Approach
Step 1: Remove Consecutive Duplicates

Consecutive equal elements belong to the same hill or valley.
So first, compress the array by removing adjacent duplicates.

Example:

Input:  [21,21,21,2,2,2,21,21,45]
After compression: [21,2,21,45]


This simplifies comparisons and avoids incorrect counting.

Step 2: Check Each Middle Element

For each index i from 1 to list.size() - 2:

Let:

l = list.get(i - 1)

c = list.get(i)

r = list.get(i + 1)

If:

c > l && c > r → Hill

c < l && c < r → Valley

Increment count accordingly.

Time Complexity

O(n)

Space Complexity

O(n) — due to storing compressed array

Java Code:
*/
import java.util.*;

class Solution {
    public int countHillValley(int[] nums) {

        // Step 1: Remove consecutive duplicates
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.isEmpty() || list.get(list.size() - 1) != num) {
                list.add(num);
            }
        }

        int count = 0;

        // Step 2: Count hills and valleys
        for (int i = 1; i < list.size() - 1; i++) {

            int l = list.get(i - 1);
            int c = list.get(i);
            int r = list.get(i + 1);

            if ((c > l && c > r) || (c < l && c < r)) {
                count++;
            }
        }

        return count;
    }
}

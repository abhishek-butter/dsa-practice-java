/*
You are given an array nums of positive integers and an integer k.

In one operation, you can remove the last element of the array and add it to your collection.

Return the minimum number of operations needed to collect elements 1, 2, ..., k.

 

Example 1:

Input: nums = [3,1,5,4,2], k = 2
Output: 4
Explanation: After 4 operations, we collect elements 2, 4, 5, and 1, in this order. Our collection contains elements 1 and 2. Hence, the answer is 4.
Example 2:

Input: nums = [3,1,5,4,2], k = 5
Output: 5
Explanation: After 5 operations, we collect elements 2, 4, 5, 1, and 3, in this order. Our collection contains elements 1 through 5. Hence, the answer is 5.

Approach:
Key Idea

Since only the last element can be removed, we must process the list from right to left.

Reversing the list allows us to simulate this behavior using a simple forward loop.

We must ignore duplicates, so we track which required elements have already been collected.

Once all k required elements are collected, we stop immediately.

✅ Algorithm

Initialize:

operations to count how many elements are removed.

needed = k to track how many required elements are still missing.

A boolean array seen of size k+1 to track collected elements.

Reverse the list nums.

Iterate through the reversed list:

If needed == 0, return operations.

If the current element is <= k and has not been seen before:

Mark it as seen.

Decrease needed.

Increase operations for every element processed.

Return operations after the loop ends.


*/
class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int operations = 0;
        int needed = k;
        boolean[] seen = new boolean[k + 1];

        Collections.reverse(nums);

        for (int i = 0; i < nums.size(); i++) {
            if (needed == 0) {
                return operations;
            }

            if (nums.get(i) <= k && !seen[nums.get(i)]) {
                seen[nums.get(i)] = true;
                needed--;
            }

            operations++;
        }

        return operations;
    }
}


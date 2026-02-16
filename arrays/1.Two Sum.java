/*
Two Sum — Java Solution (HashMap Lookup Approach)

Problem:
Given an integer array nums and an integer target, return the indices of the two numbers
such that they add up to the target.

Each input has exactly one solution, and you may not use the same element twice.

Approach:
This solution uses a HashMap to store previously seen numbers and their indices.

Key Idea:
For each number nums[i], we check if (target − nums[i]) already exists in the HashMap.
If it exists, we have found the pair. Otherwise, we store the current number and its index.

Steps:
1. Create a HashMap to store number → index.
2. Traverse the array.
3. For each element:
   • Check if (target − nums[i]) exists in HashMap using containsKey()
   • If yes → return the stored index and current index
   • If no → store current number and index using put()
4. Return empty array (problem guarantees a solution exists).

Time Complexity: O(n)
Space Complexity: O(n)

Java Code:

*/
import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> set = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            if(set.containsKey(target - nums[i]))
                return new int[]{set.get(target - nums[i]), i};

            set.put(nums[i], i);
        }

        return new int[]{};
    }
}

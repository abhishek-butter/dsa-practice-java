/*
2815. Max Pair Sum in an Array
Problem Statement

You are given an integer array nums.

For each number, determine its largest digit.
Among all pairs of numbers that share the same largest digit, return the maximum possible sum of such a pair.

If no valid pair exists, return -1.

Approach
Key Idea

For every number:

Compute its maximum digit.

Group numbers based on that maximum digit (0–9).

For each digit group, maintain the two largest numbers.

Compute the maximum possible sum among all valid groups.

Why This Works

Each number belongs to exactly one digit group (based on its maximum digit).

For each group, we only need the top two numbers to compute the maximum pair sum.

Since digits range from 0 to 9, we use a fixed-size array of size 10.

This avoids sorting and ensures optimal performance.

Time Complexity

O(n × d)
Where:

n = number of elements

d = number of digits in each number (at most 10 for integers)

Effectively O(n)

Space Complexity

O(1)
(Only a 10 × 2 array is used)

*/
class Solution {
    public int maxSum(int[] nums) {

        int[][] best = new int[10][2];

        // Initialize top two values for each digit group
        for(int i = 0; i < 10; i++) {
            best[i][0] = -1;
            best[i][1] = -1;
        }

        int result = -1;

        for(int n : nums) {

            int temp = n;
            int maxDigit = 0;

            // Find largest digit of current number
            while(temp > 0) {
                maxDigit = Math.max(maxDigit, temp % 10);
                temp /= 10;
            }

            // Maintain top two numbers for this digit group
            if(n > best[maxDigit][0]) {
                best[maxDigit][1] = best[maxDigit][0];
                best[maxDigit][0] = n;
            }
            else if(n > best[maxDigit][1]) {
                best[maxDigit][1] = n;
            }
        }

        // Compute maximum pair sum
        for(int i = 0; i < 10; i++) {
            if(best[i][1] != -1) {
                result = Math.max(result, best[i][0] + best[i][1]);
            }
        }

        return result;
    }
}

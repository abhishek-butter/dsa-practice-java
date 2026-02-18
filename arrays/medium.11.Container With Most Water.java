/*Container With Most Water — Java Solution

Problem:
Given an array height where each element represents the height of a vertical line,
find two lines that together with the x-axis form a container that holds the maximum water.

Approach:
We use the Two Pointer technique to efficiently solve the problem in O(n) time.

Key Insight:
The area is determined by:
area = min(height[left], height[right]) × (right - left)

Steps:
1. Start with two pointers at the beginning (left) and end (right) of the array.
2. Calculate the area between them.
3. Update the maximum area if the current area is greater.
4. Move the pointer pointing to the smaller height inward, because moving the taller
   pointer cannot increase the area.
5. Repeat until both pointers meet.

This works because reducing width can only be compensated by increasing height.

Time Complexity: O(n)
Space Complexity: O(1)

Java Code:
*/
class Solution {

    public int maxArea(int[] height) {

        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {

            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;

            max = Math.max(max, area);

            // Move the pointer with smaller height inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}

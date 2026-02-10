/*📘 Question

3131. Find the Integer Added to Array I

You are given two integer arrays nums1 and nums2 of equal length.
Each element in nums1 has been increased (or decreased) by the same integer x to form nums2.

Two arrays are considered equal if they contain the same integers with the same frequencies.

👉 Return the integer x.

🧠 Approach

Sort both arrays

Sorting ensures corresponding elements are aligned.

Compute the difference

The value x must be:

x = nums2[0] - nums1[0]


Validate for all elements

For every index i, check:

nums2[i] - nums1[i] == x


If any mismatch occurs, return 0 (though the problem guarantees a valid answer).

Return x

⏱️ Complexity

Time: O(n log n) (sorting)

Space: O(1) extra space

*/
import java.util.Arrays;

class Solution {

    /**
     * Finds the integer added to every element of nums1
     * to make it equal to nums2.
     *
     * @param nums1 first array
     * @param nums2 second array
     * @return the added integer
     */
    public int addedInteger(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int prev = nums2[0] - nums1[0];

        for (int i = 1; i < nums1.length; i++) {
            if (nums2[i] - nums1[i] != prev) {
                return 0; // safety check
            }
        }

        return prev;
    }
}

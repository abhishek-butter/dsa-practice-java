/*
Roman to Integer — Java Solution

Problem:
Given a Roman numeral string, convert it to an integer.

Roman numerals use seven symbols:
I = 1
V = 5
X = 10
L = 50
C = 100
D = 500
M = 1000

Special Rule:
If a smaller value appears before a larger value, it must be subtracted instead of added.

Examples:
IV = 4   (5 - 1)
IX = 9   (10 - 1)
XL = 40  (50 - 10)

Approach:
We use a HashMap to store Roman numeral values and iterate through the string.

Steps:
1. Create a HashMap to map each Roman character to its integer value.
2. Traverse the string from left to right.
3. For each character:
   • If the current value is less than the next value → subtract it
   • Otherwise → add it
4. Return the final sum.

This works because Roman numerals follow a predictable subtract-before-add rule.

Time Complexity: O(n)
Space Complexity: O(1)

Java Code:
*/
import java.util.HashMap;

class Solution {

    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = map.get(s.charAt(i));

            if (i < s.length() - 1 && current < map.get(s.charAt(i + 1))) {
                sum -= current;
            } 
            else {
                sum += current;
            }
        }

        return sum;
    }
}

/*
Valid Anagram — Java Solution (HashMap Frequency Counting)

Problem:
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An anagram is a word formed by rearranging the letters of another word,
using all original characters exactly once.

Approach:
This solution uses a HashMap to count character frequencies in the first string,
and then decreases the count using characters from the second string.

Steps:
1. If lengths differ, return false.
2. Convert first string to char array and count frequency of each character using HashMap.
3. Convert second string to char array and decrease frequency for each character.
4. If a character does not exist or frequency becomes negative, return false.
5. If all checks pass, return true.

Time Complexity: O(n)
Space Complexity: O(1) (since max 26 lowercase letters)

Java Code:

*/
import java.util.HashMap;

class Solution {

    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> c = new HashMap<>();

        if (s.length() != t.length()) return false;

        char[] s1 = s.toCharArray();

        for (char n : s1) {
            c.put(n, c.containsKey(n) ? c.get(n) + 1 : 1);
        }

        char[] s2 = t.toCharArray();

        for (char n : s2) {

            if (!c.containsKey(n)) return false;

            if (c.get(n) == 0) return false;

            c.put(n, c.get(n) - 1);
        }

        return true;
    }
}

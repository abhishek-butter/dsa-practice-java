/*

# 2496. Maximum Value of a String in an Array

## Question

The value of an alphanumeric string can be defined as:

- If the string contains only digits, its value is its integer value.
- Otherwise, its value is its length.

Given an array of strings `strs`, return the maximum value of any string.

Example:

Input: strs = ["alic3","bob","3","4","00000"]  
Output: 5

Explanation:
- "alic3" → length = 5  
- "bob" → length = 3  
- "3" → value = 3  
- "4" → value = 4  
- "00000" → value = 0  

Maximum = 5

---

## Approach

We iterate through each string and determine whether it is numeric or alphanumeric.

Steps:

1. Initialize max = 0
2. For each string:
   - Assume it is numeric
   - Check each character using Character.isDigit()
   - If any character is not a digit → treat string as alphanumeric
3. If numeric → convert using Integer.parseInt()
4. If alphanumeric → use string length
5. Update max accordingly
6. Return max

Time Complexity: O(n × m)  
n = number of strings  
m = average string length  

Space Complexity: O(1)

---

*/


class Solution {
    public int maximumValue(String[] strs) {
        
        int max = 0;
        
        for(String s : strs){
            
            int isNumeric = 1;
            
            for(char c : s.toCharArray()){
                if(!Character.isDigit(c)){
                    isNumeric = 0;
                    break;
                }
            }
            
            if(isNumeric == 1){
                int value = Integer.parseInt(s);
                max = value > max ? value : max;
            }
            else{
                max = s.length() > max ? s.length() : max;
            }
        }
        
        return max;
    }
}

/*
 1046. Last Stone Weight

## Question
You are given an array of integers `stones` where `stones[i]` represents the weight of the ith stone.

We repeatedly choose the two heaviest stones and smash them together.

- If both stones have equal weight, both are destroyed.
- If they have different weights, the smaller stone is destroyed and the larger stone becomes (difference of weights).

Return the weight of the last remaining stone. If no stones remain, return 0.

Example:
Input: stones = [2,7,4,1,8,1]
Output: 1

---

## Approach (ArrayList + Reverse Sorting)

We use an ArrayList to dynamically manage the stones.

Steps:

1. Add all stones into an ArrayList.
2. Sort the ArrayList in descending order so the largest stones are always at index 0 and 1.
3. While there are more than one stone:
   - Take the first two largest stones.
   - If they are not equal, add their difference back into the list.
   - Remove both stones from the list.
   - Sort the list again in descending order.
4. If the list becomes empty, return 0. Otherwise return the remaining stone.

Time Complexity: O(n² log n)  
Space Complexity: O(n)

---

## Code

*/
import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        
        ArrayList<Integer> l = new ArrayList<>();
        
        for(int s : stones){
            l.add(s);
        }
        
        Collections.sort(l, Collections.reverseOrder());
        
        while(l.size() > 1){
            
            int x = l.get(0);
            int y = l.get(1);
            
            if(x != y){
                l.add(x - y);
            }
            
            l.remove(0);
            l.remove(0);
            
            Collections.sort(l, Collections.reverseOrder());
        }
        
        return l.size() == 0 ? 0 : l.get(0);
    }
}

/*
Best Time to Buy and Sell Stock — Java Solution (Running Minimum Tracking)

Problem:
You are given an array prices where prices[i] represents the price of a stock on day i.
You want to maximize your profit by choosing a single day to buy one stock and a different
future day to sell that stock.

Return the maximum profit you can achieve. If no profit is possible, return 0.

Approach:
This solution tracks the minimum price seen so far while traversing the array.
For each price, we calculate the profit if we sell at that price and update the maximum profit.

Key Insight:
Profit = current price − minimum price seen so far

Steps:
1. Initialize min to a very large value.
2. Traverse the array.
3. Update min if current price is smaller.
4. Calculate profit using current price − min.
5. Update maxprofit if the calculated profit is greater.
6. Return maxprofit.

Time Complexity: O(n)
Space Complexity: O(1)

Java Code:
*/
class Solution {

    public int maxProfit(int[] prices) {

        int maxprofit = 0;
        int min = 100000;

        for(int n : prices){

            if(n < min){
                min = n;
            }

            int profit = n - min;

            maxprofit = Math.max(maxprofit, profit);
        }

        return maxprofit;
    }
}

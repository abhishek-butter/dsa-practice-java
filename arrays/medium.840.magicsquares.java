/*
Magic Squares in Grid — Java Solution

Problem:
A 3×3 magic square is a grid where:
• All numbers are between 1 and 9
• Each number appears exactly once
• All rows, columns, and both diagonals have the same sum

Approach:
We iterate through every possible 3×3 subgrid in the given matrix and check if it satisfies magic square conditions.

Steps:
1. Traverse each possible 3×3 subgrid using nested loops.
2. Use a boolean array to ensure numbers are unique and between 1 and 9.
3. Compute the reference sum using the first column.
4. Compare all rows, columns, and diagonals against this sum.
5. Increment count if all conditions are satisfied.

Time Complexity: O(m × n)  
Space Complexity: O(1)

Java Code:
*/
class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int ms = 0;

        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {

                boolean[] seen = new boolean[10];
                boolean valid = true;

                // Check uniqueness and range (1–9)
                for (int r = i; r < i + 3; r++) {
                    for (int c = j; c < j + 3; c++) {
                        int num = grid[r][c];

                        if (num < 1 || num > 9 || seen[num]) {
                            valid = false;
                            break;
                        }
                        seen[num] = true;
                    }
                    if (!valid) break;
                }

                if (!valid) continue;

                // Reference sum
                int sum = grid[i][j] + grid[i+1][j] + grid[i+2][j];

                // Diagonals
                if (grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2] != sum) continue;
                if (grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j] != sum) continue;

                // Columns
                if (grid[i][j+1] + grid[i+1][j+1] + grid[i+2][j+1] != sum) continue;
                if (grid[i][j+2] + grid[i+1][j+2] + grid[i+2][j+2] != sum) continue;

                // Rows
                if (grid[i][j] + grid[i][j+1] + grid[i][j+2] != sum) continue;
                if (grid[i+1][j] + grid[i+1][j+1] + grid[i+1][j+2] != sum) continue;
                if (grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2] != sum) continue;

                ms++;
            }
        }

        return ms;
    }
}

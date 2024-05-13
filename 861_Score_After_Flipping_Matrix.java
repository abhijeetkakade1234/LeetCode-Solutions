/* 861. Score After Flipping Matrix */

class Solution {
    public int matrixScore(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length, count, score = n;
        for (int  j = 1; j < m; j++)
        {
            count = 0;
            for (int i = 0; i < n; i++)
            {
                if (grid[i][0] == grid[i][j]) count++;
            }
            score = (score << 1) + Math.max(count, n - count);
        }
        return score;
    }
}

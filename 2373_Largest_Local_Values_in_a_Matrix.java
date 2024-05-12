/* 2373. Largest Local Values in a Matrix */

class Solution {
    public int[][] largestLocal(int[][] grid) 
    {
        int n = grid.length;
        int res[][] = new int[n - 2][n - 2];

        for(int i = 0; i < n - 2; i++)
        {
            for (int j = 0; j < n - 2; j++)
            {
                res[i][j] = maxEle(grid, i, j);
            }
        }

        return res;
    }

    private int maxEle(int grid[][], int k, int l)
    {
        int maxInt = 0;
        for (int i = k; i < k + 3; i++)
        {
            for (int j = l; j < l + 3; j++)
            {
                maxInt = Math.max(maxInt, grid[i][j]);
            }
        }
        return maxInt;
    }
}

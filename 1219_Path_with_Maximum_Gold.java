/* 1219. Path with Maximum Gold */

class Solution  {
    public int getMaximumGold(int[][] grid) 
    {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxGold = 0;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                maxGold = Math.max(maxGold, backtrack(grid, i, j));
            }
        }

        return maxGold;
    }

    private int backtrack(int[][] grid, int row, int col)
    {
        int rows = grid.length;
        int cols = grid[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == 0)
        {
            return 0;
        }

        int temp = grid[row][col];
        grid[row][col] = 0;

        int maxGold = 0;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for(int i = 0; i < 4; i++)
        {
            maxGold = Math.max(maxGold, backtrack(grid, row + dx[i], col + dy[i]));
        }
         
        grid[row][col] = temp;

        return maxGold + temp;
    }
}

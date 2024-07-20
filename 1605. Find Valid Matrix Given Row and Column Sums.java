/* 1605. Find Valid Matrix Given Row and Column Sums */

class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length;
        int m = colSum.length;

        int[] curRowSum = new int[n];
        int[] curColSum = new int[m];

        int[][] originalMat = new int[n][m];
        for (int  row = 0; row < n; row++){
            for (int col = 0; col < m; col++){
                int rowRemaining = rowSum[row] - curRowSum[row];
                int colRemaining = colSum[col] - curColSum[col];
                originalMat[row][col] = Math.min(rowRemaining, colRemaining);

                curRowSum[row] += originalMat[row][col];
                curColSum[col] += originalMat[row][col];
            }
        }

        return originalMat;
    }
}

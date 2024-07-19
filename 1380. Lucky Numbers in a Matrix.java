/* 1380. Lucky Numbers in a Matrix */

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < n; i++) {
            int num1 = Integer.MAX_VALUE;
            int num2 = -1;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < num1) {
                    num1 = matrix[i][j];
                    num2 = j;
                }
            }
            boolean f = true;
            for (int row = 0; row < n; row++) {
                if (matrix[row][num2] > num1) {
                    f = false;
                    break;
                }
            }

            if (f) {
                list.add(num1);
            }
        }

        return list;
    }
}

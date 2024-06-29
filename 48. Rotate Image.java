/* 48. Rotate Image */

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // swap  
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                swap(matrix, i, j);
            }
        }

        // reverse
        
        for (int i = 0; i < n; i++){
            int left = 0;
            int right = n - 1;
            while (left < right){
                reverse(matrix, left, right, i);  
                left++;
                right--;              
            }
        }
    }

    public void swap(int[][] matrix, int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public void reverse(int[][] matrix, int left, int right, int i){
        int temp = matrix[i][left];
        matrix[i][left] = matrix[i][right];
        matrix[i][right] = temp;
    }
}

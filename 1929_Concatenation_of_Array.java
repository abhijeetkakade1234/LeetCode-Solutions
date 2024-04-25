/* 1929. Concatenation of Array */

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int m = n + n;
        int[] ans = new int[m];
        for (int i = 0; i < n; i++)
        {
            ans[i] = nums[i];
        }
        int j = 0;
        for (int i = n; i < m; i++)
        {
            ans[i] = nums[j];
            j++; 
        }
        return ans;
    }
}

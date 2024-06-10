/* 1051. Height Checker */

class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int count = 0;
        int[] expected = Arrays.copyOf(heights, n);
        Arrays.sort(expected);
        for (int i = 0; i < n; i++)
        {
            if (expected[i] != heights[i]) count++;
        }
        return count;
    }
}

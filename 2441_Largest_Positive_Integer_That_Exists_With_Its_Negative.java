/* 2441. Largest Positive Integer That Exists With Its Negative */

class Solution {
    public int findMaxK(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n; i++)
        {
            for(int j = n - 1; j > 0; j--)
            {
                if (nums[i] + nums[j] == 0) return nums[j];
            }
        }
        
        return -1;
    }
}

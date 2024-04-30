/* 283. Move Zeroes */

class Solution {
    public void moveZeroes(int[] nums)
    {
        int n = nums.length;

        if (nums == null || n == 0) return;

        int move0 = 0;
        for (int i = 0; i < n; i++)
        {
            if (nums[i] != 0)
            {
                nums[move0] = nums[i];
                move0++;
            }
        }

        while (move0 < n)
        {
            nums[move0] = 0;
            move0++;
        }
    }
}

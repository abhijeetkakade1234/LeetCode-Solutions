/* 995. Minimum Number of K Consecutive Bit Flips */

class Solution {
    public int minKBitFlips(int[] nums, int k) {
         int cur_window_flips = 0;
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i - k >= 0 && nums[i - k] == 2) {
                cur_window_flips--;
            }

            if ((nums[i] + cur_window_flips) % 2 == 0) {
                if (i + k > nums.length) {
                    return -1;
                }
                res++;
                cur_window_flips++;
                nums[i] = 2;
            }
        }

        return res;
    }
}

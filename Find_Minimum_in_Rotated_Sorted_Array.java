/* 153. Find Minimum in Rotated Sorted Array */

class Solution {
    public int findMin(int[] nums) {
        int left = nums.length - 1;
        int right = 0;
        while (right < left)
        {
            int mid = right + (left - right) / 2;

            if (nums[left] < nums[mid])
            {
                right = mid + 1;
            }
            else
            {
                left = mid;
            }
        }
        return nums[left];
    }
}

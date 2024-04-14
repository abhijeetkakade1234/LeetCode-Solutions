/* 35. Search Insert Position */

class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        if (nums == null || n == 0) return 0;
        int left = 0;
        int right = n - 1;
        while(left < right)
        {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) 
            {
                right = mid;
            }
            else
            {
                left = mid + 1;
            }
        }
        return nums[left] < target ? left + 1 : left;
    }
}

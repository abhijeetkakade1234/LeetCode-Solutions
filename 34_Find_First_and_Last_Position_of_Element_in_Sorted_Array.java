/* 34. Find First and Last Position of Element in Sorted Array */

class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int left = leftSearch(nums, target);
        int right = rightSearch(nums, target);
        return new int[]{left, right};
    }
    private int leftSearch(int[] nums, int target)
    {
        int n = nums.length;
        int index = -1;
        int right = n - 1;
        int left = 0;
        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
            {
                index = mid;
                right = mid - 1;
            }
            else if (nums[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return index;
    }
    private int rightSearch(int[] nums, int target)
    {
        int n = nums.length;
        int index = -1;
        int right = n - 1;
        int left = 0;
        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
            {
                index = mid;
                left = mid + 1;
            }
            else if (nums[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return index;
    }
}

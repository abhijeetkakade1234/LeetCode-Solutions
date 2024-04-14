/* 35. Search Insert Position */

// with binary search
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

// without binary search

class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++)
        {
            if (nums[i] > target) return i;
            else if (nums[i] == target) return i;
        }
        return n;
    }
}

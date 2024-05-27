/* 1608. Special Array With X Elements Greater Than or Equal X */

class Solution {
    public int specialArray(int[] nums) 
    {
        int n = nums.length;
        int left = 0;
        int right = n;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            int currNum = count(nums, mid);
            if (currNum == mid)
            {
                return mid;
            }
            else if (currNum < mid)
            {
                right = mid - 1;
            }
            else if (currNum > mid)
            {
                left = mid + 1;
            }
        }
        return -1;
    }

    private int count(int[] nums, int mid)
    {
        int c = 0;
        for (int num : nums)
        {
            if (num >= mid)
            {
                c++;
            }
        }
        return c;
    }
}

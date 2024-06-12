/* 75. Sort Colors */

class Solution {
    public void sortColors(int[] nums) 
    {
        int pt1 = 0, pt2 = nums.length - 1, i = 0;
        while (i <= pt2)
        {
            if(nums[i] == 0)
            {
                swap(pt1++, i++, nums);
            }
            else if (nums[i] == 2)
            {
                swap(pt2--, i, nums);
            }
            else    
                i++;
        }
    }

    public void swap(int i, int j, int[] nums)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

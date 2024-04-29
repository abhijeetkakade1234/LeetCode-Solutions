/* 169. Majority Element */

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int common = 0;
        for (int num: nums)
        {
            if (count == 0)
            {
                common = num;
            }

            if (num == common)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return common;
    }
}

/* 945. Minimum Increment to Make Array Unique */

class Solution {
    public int minIncrementForUnique(int[] nums) {
       Arrays.sort(nums);
       int result = 0;
       for (int i = 1; i < nums.length; i++)
       {
            if (nums[i - 1] >= nums[i]){
                result += nums[i - 1] - nums[i] + 1;
                nums[i] = nums[i - 1] + 1;
            }
       } 
       return result;
    }
}

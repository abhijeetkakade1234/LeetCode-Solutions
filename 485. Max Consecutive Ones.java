/* 485. Max Consecutive Ones */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int MaxSum = 0;
        for (int i = 0; i < n; i++){
            sum += nums[i];
            if (nums[i] == 0){
                sum = 0;
            }
            MaxSum = Math.max(MaxSum, sum);
        }

        return MaxSum;
    }
}

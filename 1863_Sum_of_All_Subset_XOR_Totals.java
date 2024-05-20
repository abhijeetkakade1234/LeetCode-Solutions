/* 1863. Sum of All Subset XOR Totals */

class Solution {
    public int subsetXORSum(int[] nums) {

        return Xor(nums, 0, 0);
    }

    private int Xor(int nums[], int level, int currentXor)
    {
        int n = nums.length;
        if (level == n) return currentXor;

        int include = Xor(nums, level + 1, currentXor^nums[level]);
        int exclude = Xor(nums, level + 1, currentXor);

        return exclude + include;
    }
}

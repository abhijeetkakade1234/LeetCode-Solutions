/* 1752. Check if Array Is Sorted and Rotated */

class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++){
            if (nums[i] > nums[(i + 1) % n]){
                j++;
            }
            if (j > 1) return false;
        }
        return true;
    }
}

/* 189. Rotate Array */

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        swap (nums, 0, n - 1);
        swap (nums, 0, k - 1);
        swap (nums, k, n - 1);
    }

    private void swap(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

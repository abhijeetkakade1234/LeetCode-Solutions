/* 189. Rotate Array */

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        swap (nums, 0, n - 1); // reverse entire string -> 7,6,5,4,3,2,1
        swap (nums, 0, k - 1); // reverse first k strings - > 5,6,7,4,3,2,1
        swap (nums, k, n - 1); // reverse remainning -> 5,6,7,1,2,3,4
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

/* 1248. Count Number of Nice Subarrays */

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int result = 0;
        int left = 0;
        int middle = 0;
        int odd = 0;

        for (int right = 0; right < n; right++) {
            if (nums[right] % 2 == 1) {
                odd++;
            }

            while (odd > k) {
                if (nums[left] % 2 ==1){
                    odd--;
                }
                left++;
            }
            middle = left;

            if (odd == k) {
                while (nums[middle] % 2 != 1) {
                    middle++;
                }
                result += (middle - left) + 1;
            }
        }

        return result;
    }
}

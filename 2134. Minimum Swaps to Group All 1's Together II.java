/* 2134. Minimum Swaps to Group All 1's Together II */

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int one = 0;
        for (int num : nums) one += num;
        if (one == n || one == 0) return 0;
        int answer = n;
        int zero = 0;
        int i;
        for (i = 0; i < one; i++){
            zero += 1 - nums[i];
        }

        for (int j = 0; j < n; i = (i + 1) % n, j++){
            zero += nums[j] - nums[i];
            answer = Math.min(zero, answer);
        }
        return answer;
    }
}   
        

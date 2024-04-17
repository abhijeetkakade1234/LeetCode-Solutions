/* 198. House Robber */

class Solution {
    public int rob(int[] nums) 
    {
        int n = nums.length;
        if (n == 0) return 0;
        if (n < 2) return nums[0];

        int[] r = new int[n]; // new array to store addition

        r[0] = nums[0]; // 1st element
        r[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) // i = 2 coz r[1] and r[0] will be iterated again 
        {
            r[i] = Math.max(r[i - 2] + nums[i], r[i - 1]); // Main Logic which addition is highest
        }
        return r[n - 1]; // Return the last element of the array, which contains the maximum sum
    }
}

// logic explation ->   https://youtu.be/VXqUQYGMnQg?si=bShK6MYuwzZI31h2

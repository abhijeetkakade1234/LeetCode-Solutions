/* 719. Find K-th Smallest Pair Distance */

class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int right = nums[n - 1] - nums[0];

        while (left < right){
            int mid = left + (right - left) / 2;
            if (countPairs(nums, mid, n) < k)
                    left = mid + 1; 
            else
                right = mid;
        }
        
        return left;
    }

    private int countPairs(int[] nums, int maxDistance, int n){
        int count = 0, j = 0;
        for (int i = 0; i < n; i++){
            while (j < n && nums[j] - nums[i] <= maxDistance) j++;
            count += j - i - 1;
        }

        return count;
    }
}

/* 1482. Minimum Number of Days to Make m Bouquets */

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int left = Arrays.stream(bloomDay).min().getAsInt();
        int right = Arrays.stream(bloomDay).max().getAsInt();
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (!isPossible(bloomDay, mid, k, m)) {
                left = mid + 1;
            } else {
                result = mid;
                right = mid - 1;
            }
        }
        return result;
    }

    private boolean isPossible(int[] bloomDay, int mid, int k, int m) {
        int flowerCollected = 0, bouquets = 0;
        for (int val : bloomDay) {
            if (val <= mid)
                flowerCollected++;
            else
                flowerCollected = 0;

            if (flowerCollected == k) {
                bouquets++;
                flowerCollected = 0;
            }
        }
        return bouquets >= m;
    }
}

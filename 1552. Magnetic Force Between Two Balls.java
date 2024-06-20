/* 1552. Magnetic Force Between Two Balls */

class Solution {
    public int maxDistance(int[] position, int balls) {
        int n = position.length;
        int result = -1;
        Arrays.sort(position);
        int left = 0;
        int right = (position[n - 1] - position[0]) / (balls - 1);

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (!isPossible(position, mid, balls)) {
                right = mid - 1;
            } else {
                result = mid;
                left = mid + 1;
            }
        }
        return result;
    }

    public boolean isPossible(int[] position, int mid, int balls) {
        int previousBall = 0, cntBallPlaced = 1;
        for (int i = 0; i < position.length; i++) {
            if (position[i] - position[previousBall] >= mid) {
                cntBallPlaced++;
                previousBall = i;
            }
        }

        return (cntBallPlaced >= balls);
    }
}

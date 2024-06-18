/* 826. Most Profit Assigning Work */

class Solution {
    public int findMax(int[] difficulty) {
        int max = 0;
        for (int val : difficulty) {
            max = Math.max(max, val);
        }
        return max;
    }

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxProfit = 0;
        int n = difficulty.length;
        int maxVal = findMax(difficulty);
        int[] jobs = new int[maxVal + 1];

        for (int i = 0; i < n; i++) {
            int index = difficulty[i];
            jobs[index] = Math.max(jobs[index], profit[i]);
        }

        for (int i = 1; i < jobs.length; i++) {
            jobs[i] = Math.max(jobs[i], jobs[i - 1]);
        }

        for (int i = 0; i < worker.length; i++) {
            if (worker[i] > maxVal)
                maxProfit += jobs[maxVal];
            else
                maxProfit += jobs[worker[i]];
        }

        return maxProfit;
    }
}

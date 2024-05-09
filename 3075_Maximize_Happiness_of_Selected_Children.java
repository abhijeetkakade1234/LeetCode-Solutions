/* 3075. Maximize Happiness of Selected Children */

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n = happiness.length;
        int dec = 0;
        long max = 0;
        Arrays.sort(happiness);

        for(int i = n - 1; i >= n - k; i--)
        {
            int happy = happiness[i] - dec;
            if (happy > 0)
            {
                max += happy;
            }
            dec++;
        }

        return max;
    }
}

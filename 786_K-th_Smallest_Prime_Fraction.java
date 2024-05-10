/* 786. K-th Smallest Prime Fraction */

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n =  arr.length;
        double low = 0;
        double high = 1.0, mid = 0;
        while(low < high)
        {
            mid = low + (high - low) / 2;
            int[] count = f(arr, mid);
            if (k < count[0])
            {
                high = mid;
            }
            else if (k > count[0])
            {
                low = mid;
            }
            else
            {
                return new int[] {count[1], count[2]};
            }
        }
        return null;
    }
    private int[] f(int[] arr, double target)
    {
        int count = 0, i = 0, n = arr.length, num = arr[0], den = arr[n - 1];

        for(int j = 1; j < n; j++)
        {
            while(arr[i] <= arr[j] * target)
            {
                i++;
            }
            count += i;
            if (i > 0 && arr[i - 1] * den > arr[j] * num)
            {
                num = arr[i - 1];
                den = arr[j];
            }
        }
        return new int[] {count, num, den};
    }
}

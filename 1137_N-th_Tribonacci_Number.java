/* 1137. N-th Tribonacci Number */

class Solution {
    public int tribonacci(int n) 
    {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int[] F = new int[n + 1];
        F[0] = 0;
        F[1] = 1;
        F[2] = 1;
        for (int i = 3; i < n + 1; i++)
        {
            F[i] = F[i] + F[i - 1] + F[i - 2] + F[i - 3];
        }
        return F[n];
    }
}

/* 552. Student Attendance Record II */

class Solution {
    final int Mod = 1000000007;
    public int checkRecord(int n) 
    {
        int[][][] cache = new int[n+1][2][3];

        for(int[][] c1 : cache)
        {
            for(int[] c2 : c1) Arrays.fill(c2, -1);
        } 
        return checkRecord(n, 0, 0, cache);
    }

    private int checkRecord(int n, int absentCount, int lateCount, int[][][] cache)
    {
        if (n == 0) return 1;

        if (cache[n][absentCount][lateCount] == -1)
        {
            int count = checkRecord(n -1, absentCount, 0, cache) % Mod;

            if (absentCount < 1)
            {
                count = (count + checkRecord(n - 1, absentCount + 1, 0, cache)) % Mod;
            }

            if (lateCount < 2)
            {
                count = (count + checkRecord(n - 1, absentCount, lateCount + 1, cache)) % Mod;
            }
            cache[n][absentCount][lateCount] = count;
        }
        return cache[n][absentCount][lateCount];
    }
}

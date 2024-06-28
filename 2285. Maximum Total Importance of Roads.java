/* 2285. Maximum Total Importance of Roads */

class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long[] edgeCount = new long[n];

        for (int[] edge : roads){
            edgeCount[edge[0]]++;
            edgeCount[edge[1]]++;
        }

        Arrays.sort(edgeCount);

        long label = 1;
        long result = 0;

        for (long e : edgeCount){
            result += (label * e);
            label++;
        }

        return result;
    }
}

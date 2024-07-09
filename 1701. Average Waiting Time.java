/* 1701. Average Waiting Time */

class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        int idleTime = 0;
        long waitTime = 0;

        for (int i = 0; i < n; i++){
            idleTime = Math.max(customers[i][0], idleTime) + customers[i][1];
            waitTime += idleTime - customers[i][0];
        }

        return (double) waitTime / n;
    }
}

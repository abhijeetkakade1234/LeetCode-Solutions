/* 2326. Spiral Matrix IV */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int i = 0, j = 0, cur = 0, movement[][] = {
            { 0, 1 },
            { 1, 0 },
            { 0, -1 },
            { -1, 0 },
        };
        int[][] res = new int[m][n];
        for (int[] row : res){
            Arrays.fill(row, -1);
        }

        while (head != null){
            res[i][j] = head.val;
            int newI = i + movement[cur][0], newJ = j + movement[cur][1];

            if (
                Math.min(newI, newJ) < 0 ||
                newI >= m ||
                newJ >= n ||
                res[newI][newJ] != -1
            ) cur = (cur+ 1) % 4;
            i += movement[cur][0];
            j += movement[cur][1];

            head = head.next;
        }
        return res;
    }
}

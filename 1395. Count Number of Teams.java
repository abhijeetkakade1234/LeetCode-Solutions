/* 1395. Count Number of Teams */

class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int teams = 0;

        int[][] incTeams = new int[n][4];
        int[][] decTeams = new int[n][4];

        for (int i = 0; i < n; i++){
            incTeams[i][1] = 1;
            decTeams[i][1] = 1;
        }

        for (int count = 2; count <= 3; count++){
            for (int i = 0; i < n; i++){
                for (int j = i + 1; j < n; j++){
                    if (rating[j] > rating[i]){
                        incTeams[j][count] += incTeams[i][count - 1];
                    }
                    if (rating[j] < rating[i]){
                        decTeams[j][count] += decTeams[i][count - 1];
                    }
                }
            }
        }

        for (int i = 0; i < n; i++){
            teams += incTeams[i][3] + decTeams[i][3];
        }

        return teams;
    }
}

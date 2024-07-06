/* 2582. Pass the Pillow */

class Solution {
    public int passThePillow(int n, int time) {
        int round = time / (n -1);
        int answer = 0;

        if (round % 2 == 0){
            answer = (1 + time % (n - 1));
        } else {
            answer = (n - time % (n - 1));
        }

        return answer;
    }
}

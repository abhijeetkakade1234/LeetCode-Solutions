/* 476. Number Complement */

class Solution {
    public int findComplement(int num) {
        int c = 0;
        int t = num;
        while (t > 0){
            t = t >> 1;
            c++;
        }
        int mask = (1<<(c)) - 1;
        return num ^ mask;
    }
}

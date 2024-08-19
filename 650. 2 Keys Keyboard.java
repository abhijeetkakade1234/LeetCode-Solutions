/* 650. 2 Keys Keyboard */

class Solution {
    public int minSteps(int n) {
        if (n == 1) return 0;
        return 1 + backTracking(1, 1, n);
    }

    private int backTracking(int currLen, int pasteLen, int n){
        if (currLen == n) return 0;

        if (currLen > n) return 1000;

        int opt1 = 2 + backTracking(currLen *2, currLen, n);
        int opt2 = 1 + backTracking(currLen + pasteLen, pasteLen, n);

        return Math.min(opt1, opt2);
    }
}

/* 1653. Minimum Deletions to Make String Balanced */

class Solution {

    public int minimumDeletions(String s) {
        int n = s.length();
        int aCount = 0;


        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a') aCount++;
        }

        int bCount = 0;
        int minDeletions = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a') aCount--;
            minDeletions = Math.min(minDeletions, aCount + bCount);
            if (s.charAt(i) == 'b') bCount++;
        }

        return minDeletions;
    }
}

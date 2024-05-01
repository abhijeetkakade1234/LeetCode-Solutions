/* 392. Is Subsequence */

class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        int n = s.length();
        int m = t.length();

        if (n < 1) return true;

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int j = 0, i = 0;
        while(i < m && j < n)
        {
            if (s1[j] == t1[i])
            {
                j++;
            }
            i++;
        }
 
        return j == n;
    }
}

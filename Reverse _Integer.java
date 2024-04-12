/* 7. Reverse Integer */

class Solution {
    public int reverse(int x) {
        int rem, rev = 0, a = 0;
        if (x < 0)
        {
            x = Math.abs(x);
            a = 1;
        }
        while (x != 0)
        {
            rem = x % 10;
            rev = (rev * 10) + rem;
            x = x / 10;
            if (rev%10 != rem)
            {
                return 0;
            }
        }
        int s = Integer.toString(rev).length();
        if (Integer.MAX_VALUE <= rev)
        {
            return 0;
        }
        if (a == 1)
        {
            rev = rev * (-1);
        }
        return rev;
    }
}

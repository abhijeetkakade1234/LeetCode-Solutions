/* 1404. Number of Steps to Reduce a Number in Binary Representation to One */

class Solution {
    public int numSteps(String s) {
        int carry = 0;
        int steps = 0;

        for (int i = s.length() - 1; i >= 1; i--)
        {
            int digit = s.charAt(i) - '0';
            if ((digit + carry) % 2 == 0) 
            {
                steps++;
            }
            else
            {
                carry = 1;
                steps += 2;
            }
        }

        return steps + carry;
    }
}

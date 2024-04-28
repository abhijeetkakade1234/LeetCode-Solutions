/* 125. Valid Palindrome */

class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;

        int n = s.length();
        int left = 0;
        int right = n - 1;

        while(left < right)
        {
            char leftpt = s.charAt(left);
            char rightpt = s.charAt(right);

            if(!Character.isLetterOrDigit(leftpt)) 
            {
                left++;
            }
            else if (!Character.isLetterOrDigit(rightpt))
            {
                right--;
            }
            else
            {
                if (Character.toLowerCase(leftpt) != Character.toLowerCase(rightpt))
                {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }
}

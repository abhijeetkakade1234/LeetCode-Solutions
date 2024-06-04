/* 409. Longest Palindrome */

class Solution {
    public int longestPalindrome(String s) 
    {
        if(s==null || s.length()==0) return 0;  
        HashSet<Character> ch = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (ch.contains(s.charAt(i)))
            {
                ch.remove(s.charAt(i));
                count++;
            }
            else 
                ch.add(s.charAt(i));
        }
        if (!ch.isEmpty()) return count * 2 + 1;
        return count * 2;
    }
}

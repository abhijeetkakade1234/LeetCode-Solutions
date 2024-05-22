/* 131. Palindrome Partitioning */

class Solution {
    public List<List<String>> partition(String s) 
    {
        List<List<String>> res = new ArrayList<>();
        List<String> current = new ArrayList<>();
        backTracking(s, 0, current, res);
        return res; 
    }
    private void backTracking(String s, int start, List<String> current, List<List<String>> res)
    {
        if (start == s.length())
        {
            res.add(new ArrayList<>(current));
            return;
        }
        for (int i = start + 1; i <= s.length(); i++)
        {
            if (isPalindrome(s, start, i - 1))
            {
                current.add(s.substring(start, i));
                backTracking(s, i, current, res);
                current.remove(current.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end)
    {
        while (start < end)
        {
            if (s.charAt(start++) != s.charAt(end--)) 
            {
                return false;
            }       
        }
        return true;
    }
}

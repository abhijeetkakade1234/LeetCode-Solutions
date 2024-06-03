/* 2486. Append Characters to String to Make Subsequence */

class Solution {
    public int appendCharacters(String s, String t) {
        int spointer = 0, tpointer = 0;
        
        while (spointer < s.length() && tpointer < t.length())
        {
            if (s.charAt(spointer) == t.charAt(tpointer))
            {
                tpointer++;
            }
            spointer++;
        }

        return t.length() - tpointer;
    }
}

/* 1208. Get Equal Substrings Within Budget */

class Solution 
{
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int currCost = 0;
        int result = 0;
        int left = 0;

        for (int right = 0; right < n; right++)
        {
            currCost += Math.abs(s.charAt(right) - t.charAt(right));

            while (currCost > maxCost)
            {
                currCost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}

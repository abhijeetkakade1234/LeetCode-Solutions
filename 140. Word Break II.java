/* 140. Word Break II */

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) 
    {
        HashSet<String> dict = new HashSet<>(wordDict);
        return backTracking(s, 0, dict);
    }
    private List<String> backTracking(String s, int start, HashSet<String> dict)
    {
        List<String> result = new ArrayList<>();
        int n = s.length();
        if (n == start)  result.add("");

        for (int i = start + 1; i <= n; i++)
        {
            String word = s.substring(start, i);
            if (dict.contains(word))
            {
                List<String> words = backTracking(s, i, dict);
                for (String wd : words)
                {
                    result.add(word + (wd.equals("") ? "" : " ") + wd);
                }
            }
        }
        return result;
    }
}

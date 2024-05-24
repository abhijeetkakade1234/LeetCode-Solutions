/* 1255. Maximum Score Words Formed by Letters */

class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) 
    {
        if (words == null || words.length == 0 || letters == null || letters.length == 0 || score == null || score.length == 0) return 0;

        int[] count = new int[26];
        int[] letterCount = new int[26];

        for (char ch : letters)
        {
            count[ch - 'a']++;
        }
        int ans = 0;
        ans = backTracking(words, score, count, letterCount, 0, 0, ans);
        return ans;

    }
    private int backTracking(String[] words, int[] score, int[] count, int[] letterCount, int pos, int temp, int ans)
    {
        for (int i = 0; i < 26; i++)
        {
            if (letterCount[i] > count[i]) return ans;
        }

        ans = Math.max(ans, temp);

        for (int i = pos; i < words.length; i++)
        {
            for (char ch : words[i].toCharArray())
            {
                letterCount[ch - 'a']++;
                temp += score[ch - 'a'];
            }

            ans = backTracking(words, score, count, letterCount, i + 1, temp, ans);
            
            for (char ch : words[i].toCharArray())
            {
                letterCount[ch - 'a']--;
                temp -= score[ch - 'a'];
            }
        
        }
        return ans;
    }
}

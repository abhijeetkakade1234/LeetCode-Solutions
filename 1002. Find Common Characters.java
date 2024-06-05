/* 1002. Find Common Characters */

class Solution {
    public List<String> commonChars(String[] words) 
    {
        int n = words.length;
        int[] commonCharCnt = new int[26];
        int[] currCharCnt = new int[26];
        List<String> result = new ArrayList();
        
        for (char ch : words[0].toCharArray())
        {
            commonCharCnt[ch - 'a']++;
        }

        for (int i = 1; i < n; i++)
        {
            Arrays.fill(currCharCnt, 0);

            for (char ch : words[i].toCharArray())
            {
                currCharCnt[ch - 'a']++;
            }
            
            for (int j = 0; j < 26; j++)
            {
                commonCharCnt[j] = Math.min(commonCharCnt[j], currCharCnt[j]);
            }
        }

        for (int letter = 0; letter < 26; letter++)
        {
            for (int commonCnt = 0; commonCnt < commonCharCnt[letter]; commonCnt++)
            {
                result.add(String.valueOf((char) (letter + 'a')));
            }
        }


        return result;
    }
}

/* 506. Relative Ranks */

class Solution {
    public String[] findRelativeRanks(int[] score) 
    {
        int n = score.length;
        String[] ans = new String[n];
        int[] temp = Arrays.copyOf(score, n);
        Arrays.sort(temp);
        Map<Integer, String> map = new HashMap();
        for (int i = 0; i < n; i++)
        {
            if (i == n - 1) map.put(temp[i], "Gold Medal");
            else if (i == n - 2) map.put(temp[i], "Silver Medal");
            else if (i == n - 3) map.put(temp[i], "Bronze Medal");
            else map.put(temp[i], Integer.toString(n - i));
        }

        for (int i = 0; i < n; i++)
        {
            ans[i] = map.get(score[i]);
        }

        return ans;
    }
}

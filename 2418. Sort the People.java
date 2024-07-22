/* 2418. Sort the People */

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        Map<Integer, String> mp = new HashMap();

        for (int i = 0; i < n; i++) {
            mp.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        for (int i = 0; i < n / 2; i++) {
            int temp = heights[i];
            heights[i] = heights[n - 1 - i];
            heights[n - 1 - i] = temp;
        }

        for (int i = 0; i < n; i++) {
            names[i] = mp.get(heights[i]);
        }

        return names;
    }
}

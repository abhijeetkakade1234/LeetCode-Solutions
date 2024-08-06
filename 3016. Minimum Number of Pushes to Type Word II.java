/* 3016. Minimum Number of Pushes to Type Word II */

class Solution {
    public int minimumPushes(String word) {
        int[] letterFreq = new int[26];
        for (char ch : word.toChar()){
            letterFreq[ch - 'a']++;
        }
        Integer[] sortedArray = new Integer[26];
        for(int i = 0; i < 26; i++){
            sortedArray[i] = letterFreq[i];
        }

        Arrays.sort(sortedArray, Collections.reverseOrder());
        int totalPress = 0;

        for (int i = 0; i < 26; i++){
            if (sortedArray[i] == 0) break;
            totalPress += (i / 8 + 1) * sortedArray[i];
        }

        return totalPress;
    }
}

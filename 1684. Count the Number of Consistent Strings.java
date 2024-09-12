/* 1684. Count the Number of Consistent Strings */

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        int[] store = new int[26];

        for (char ch : allowed.toCharArray()){
            store[ch - 'a']++;
        }

        for (String word : words){

            for (char c : word.toCharArray()){
                if (store[c - 'a'] <= 0){
                    count--;
                    break;
                }
            }
        }

        return count;
    }
}

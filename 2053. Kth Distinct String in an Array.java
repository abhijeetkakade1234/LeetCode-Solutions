/* 2053. Kth Distinct String in an Array */

class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> mp = new HashMap();
        int n = arr.length;

        for (String str : arr){
            mp.put(str, mp.getOrDefault(str, 0) + 1);
        }

        for (String str : arr){
            if (mp.get(str) == 1){
                k--;
            }
            if (k == 0) return str;
        }

        return "";
    }
}

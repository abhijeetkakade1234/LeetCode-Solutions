/* 1460. Make Two Arrays Equal by Reversing Subarrays */

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) return false;

        Map<Integer, Integer> arrFreq = new HashMap();
        for (int num : arr){
            arrFreq.put(num, arrFreq.getOrDefault(num, 0) + 1);
        }

        for (int num : target){
            if (!arrFreq.containsKey(num)) return false;

            arrFreq.put(num, arrFreq.get(num) - 1);
            if (arrFreq.get(num) == 0 ){
                arrFreq.remove(num);
            }
        }

        return arrFreq.size() == 0;
    }
}

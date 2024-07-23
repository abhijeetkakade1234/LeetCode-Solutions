/* 1636. Sort Array by Increasing Frequency */

class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap();

        for (int num : nums){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList(mp.keySet());
        Collections.sort(list, (a, b) ->{
            return (mp.get(a) == mp.get(b)) ? b - a : mp.get(a) - mp.get(b);
        });

        int res[] = new int[n];
        int i = 0;
        for (int num : list){
            for (int j = 0; j < mp.get(num); j++){
                res[i++] = num;
            }
        }
        
        return res;
    }
}

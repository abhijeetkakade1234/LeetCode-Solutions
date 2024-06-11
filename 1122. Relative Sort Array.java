/* 1122. Relative Sort Array */

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> mp = new HashMap();

        for (int element : arr1) {
            if (mp.containsKey(element)) {
                mp.put(element, mp.getOrDefault(element, 0) + 1);
            } else
                mp.put(element, 1);
        }

        int[] result = new int[arr1.length];
        int count = 0;
        for (int element : arr2) {
            while (mp.get(element) > 0) {
                result[count] = element;
                count++;
                mp.put(element, mp.get(element) - 1);
            }
            mp.remove(element);
        }

        int[] remaining = new int[arr1.length - count];
        int index = 0;
        for (int element : arr1) {
            if (mp.containsKey(element)) {
                while (mp.get(element) > 0) {
                    remaining[index] = element;
                    index++;
                    mp.put(element, mp.get(element) - 1);
                }
                mp.remove(element);
            }
        }

        Arrays.sort(remaining);
        for (int element : remaining) {
            result[count] = element;
            count++;
        }

        return result;
    }
}

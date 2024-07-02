/* 350. Intersection of Two Arrays II */

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> l = new ArrayList();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (nums1[i] == nums2[j]) {
                l.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] result = new int[l.size()];
        for ( i = 0; i < l.size(); i++) {
            result[i] = l.get(i);
        }
        return result;
    }
}

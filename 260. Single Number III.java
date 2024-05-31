/* 260. Single Number III */

class Solution {
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        Set<Integer> set = new HashSet<>();

        for (int num : nums)
        {
            if (set.contains(num))
            {
                set.remove(num);
            }
            else set.add(num);
        }

        int i = 0;
        for (int num : set)
        {
            result[i++] = num;
        }

        return result;
    }
}

/* 974. Subarray Sums Divisible by K */

class Solution {
    public int subarraysDivByK(int[] nums, int k) 
    {
        Map<Integer, Integer> mp = new HashMap();
        for (int i = 0, remainder = 0; i < nums.length; i++)
        {
            remainder = ((remainder + nums[i]) % k + k) % k;
            mp.put(remainder, mp.getOrDefault(remainder, 0) + 1);
        }
        int result = mp.getOrDefault(0,0);
        for (int val : mp.values())
        {
            result += val * (val - 1) / 2;
        }

        return result;
    }
}

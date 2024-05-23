/* 2597. The Number of Beautiful Subsets */

class Solution {
    private int count;
    private Map<Integer, Integer> visit;

    public Solution() {
        this.count = 0;
        this.visit = new HashMap<>();
    }

    public int beautifulSubsets(int[] nums, int k) 
    {
        backTracking(nums, 0, k);
        return count - 1;
    }
    private void backTracking(int[] nums,int index, int k)
    {
        if (nums.length == index)
        {
            count++;
            return;
        }
        int num = nums[index];

        if (!visit.containsKey(num - k) && !visit.containsKey(num + k))
        {
            visit.put(num, visit.getOrDefault(num, 0) + 1);
            backTracking(nums, index + 1, k);
            visit.put(num, visit.get(num) - 1);

            if (visit.get(num) == 0) visit.remove(num);
        }
        backTracking(nums, index + 1, k);
    }
}

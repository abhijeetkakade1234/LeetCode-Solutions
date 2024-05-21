/* 78. Subsets */

class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        explore(nums, 0, current, result);
        return result;
    }

    public void explore(int[] nums, int index, List<Integer> current, List<List<Integer>> result)
    {
        if (nums.length == index)
        {
            result.add(new ArrayList<>(current));
            return;
        } 

        current.add(nums[index]);
        explore(nums, index + 1, current, result);
        current.remove(current.size() - 1); // Backtracking
        
        explore(nums, index + 1, current, result);
    }
}

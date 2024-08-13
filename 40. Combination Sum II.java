/* 40. Combination Sum II */

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        Arrays.sort(candidates);
        backTrack(result, new ArrayList<Integer>(), candidates, target, 0);

        return result;
    }

    private void backTrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start){
        if (remain < 0) return;
        else if (remain == 0) result.add(new ArrayList<>(tempList));
        else{
            for (int i = start; i < candidates.length; i++){
                if (i > start && candidates[i] == candidates[i - 1]) continue;
                tempList.add(candidates[i]);
                backTrack(result, tempList, candidates, remain - candidates[i], i+1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}

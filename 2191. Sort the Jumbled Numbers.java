/* 2191. Sort the Jumbled Numbers */

class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n =nums.length;
        List<int[]> storePairs = new ArrayList();

        for (int i = 0; i < n; i++){
            int mappedValue = 0;
            int temp = nums[i];
            int place = 1;

            if (temp == 0) {
                storePairs.add(new int[] {mapping[0], i});
            }
            while (temp != 0){
                mappedValue += mapping[temp % 10] * place;
                place *= 10;
                temp /= 10;
            }
            storePairs.add(new int[] {mappedValue, i});
        }

        Collections.sort(storePairs, (a, b) -> a[0] - b [0]);

        int[] answer = new int[n];
        for (int i = 0; i < storePairs.size(); i++){
            answer[i] = nums[storePairs.get(i)[1]];
        }

        return answer;
    }
}

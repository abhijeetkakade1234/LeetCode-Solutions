/* 912. Sort an Array */

class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int answer[] = new int[n];

        PriorityQueue<Integer> pq = new PriorityQueue();
        for (int num : nums) 
                    pq.offer(num);
        
        int i = 0;
        while (!pq.isEmpty()){
            answer[i++] = pq.poll();
        }

        return answer;        
    }
}

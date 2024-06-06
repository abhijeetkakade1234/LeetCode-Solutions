/* 1296. Divide Array in Sets of K Consecutive Numbers */

class Solution {
    public boolean isPossibleDivide(int[] nums, int k) 
    {
        if (nums.length % k != 0) return false;
        
        PriorityQueue<Integer> minHeap = new PriorityQueue();
        
        for (int elem : nums) minHeap.add(elem);

        while(!minHeap.isEmpty())
        {
            int head = minHeap.poll();
            for (int i = 1; i < k; i++)
            {
                if(!minHeap.remove(head + i)) return false;
            }
        }

        return true;
    }
}

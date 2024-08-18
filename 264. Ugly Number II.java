/* 264. Ugly Number II */

class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> minHeap = new PriorityQueue();
        Set<Long> seenNos = new HashSet();
        int[] primeFactors = {2, 3, 5};

        minHeap.offer(1L);
        seenNos.add(1L);

        long currentUgly = 1L;

        for (int i = 0; i < n; i++){
            currentUgly = minHeap.poll();
            
            for (int prime : primeFactors){
                Long nextUgly = currentUgly * prime;
                if(seenNos.add(nextUgly)){
                    minHeap.offer(nextUgly);
                }
            }
        }

        return (int) currentUgly;
    }
}

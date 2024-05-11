/* 857. Minimum Cost to Hire K Workers */

class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) 
    {
        int n = quality.length;
        double res = Double.MAX_VALUE;
        double qualityTillNow = 0.0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());
        List<Worker> workers= new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            workers.add(new Worker(wage[i] / (double) quality[i], quality[i]));
        }

       Collections.sort(workers);

       for (Worker worker : workers)
       {
            double ratio = worker.ratio;
            int qua = worker.quality;

            qualityTillNow += qua;
            maxHeap.add(qua);

            if (maxHeap.size() > k)
            {
                qualityTillNow -= maxHeap.poll();
            }

            if (maxHeap.size() == k)
            {
                res = Math.min(res, qualityTillNow * ratio);
            }
       }

        return res;
    }

    private class Worker implements Comparable<Worker>
    {
        double ratio;
        int quality;


        Worker(double ratio, int quality)
        {
            this.ratio = ratio;
            this.quality = quality;
        }

        @Override
        public int compareTo(Worker other)
        {
            return Double.compare(this.ratio, other.ratio);
        }
    }
}

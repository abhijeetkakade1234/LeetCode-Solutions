/* 1791. Find Center of Star Graph */

class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> degree = new HashMap();

        for(int[] edge : edges){
            degree.put(edge[0], degree.getOrDefault(edge[0], 0) + 1);
            degree.put(edge[1], degree.getOrDefault(edge[1], 0) + 1);
        }

        for (int i : degree.keySet()){
            if (degree.get(i) == edges.length) return i;
        }

        return -1;
    }
}

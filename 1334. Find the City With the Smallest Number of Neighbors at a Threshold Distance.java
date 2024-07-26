/* 1334. Find the City With the Smallest Number of Neighbors at a Threshold Distance */

class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        List<List<int[]>> graph = new ArrayList();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList());
        }

        for (int[] edge : edges) {
            int node1 = edge[0], node2 = edge[1], distance = edge[2];
            graph.get(node1).add(new int[] { node2, distance });
            graph.get(node2).add(new int[] { node1, distance });
        }

        int minNo = n;
        int result = -1;

        for (int source = 0; source < n; source++) {
            int neighbour = dijkstra(graph, source, n, distanceThreshold);
            if (neighbour <= minNo) {
                minNo = neighbour;
                result = source;
            }
        }

        return result;
    }

    private int dijkstra(List<List<int[]>> graph, int source, int n, int distanceThreshold) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        minHeap.add(new int[] { 0, source });
        Set<Integer> visited = new HashSet();

        while (!minHeap.isEmpty()) {
            int[] top = minHeap.poll();
            int distanceToThisNode = top[0], currNode = top[1];
            if (!visited.contains(currNode)) {
                visited.add(currNode);
                for (int[] neighbour : graph.get(currNode)) {
                    int distanceFromSource = distanceToThisNode + neighbour[1];
                    if (distanceFromSource <= distanceThreshold) {
                        minHeap.add(new int[] { distanceFromSource, neighbour[0] });
                    }
                }
            }
        }

        return visited.size() - 1;
    }
}

/* 2192. All Ancestors of a Node in a Directed Acyclic Graph */

class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> result = new ArrayList();
        for (int i = 0; i < n; i++){
            result.add(new ArrayList());
        }

        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++){
            graph[i] = new ArrayList();
        }
        for (int[] edge : edges){
            graph[edge[0]].add(edge[1]);
        } 

        for (int i = 0; i < n; i++){
            dfs(graph, i, i, result, new boolean[n]);
        }

        for (int i = 0; i < n; i++){
            result.get(i).sort(Integer::compareTo);
        }
        return result;
    }

    private void dfs(ArrayList<Integer>[] graph, int parent, int current, List<List<Integer>> result, boolean[] visit){
        visit[current] = true;
        for (int g : graph[current]){
            if(!visit[g]){
                result.get(g).add(parent);
                dfs(graph, parent, g, result, visit);
            }
        }
    }
}

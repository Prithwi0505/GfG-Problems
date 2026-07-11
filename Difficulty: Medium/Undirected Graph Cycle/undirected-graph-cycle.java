class Solution {
    static boolean cycle = false;
    public static void dfs(List<List<Integer>> adj, int node, int parent, List<Boolean> visited){
        visited.set(node, true);
        for(int i = 0; i < adj.get(node).size(); i++){
            int neigh = adj.get(node).get(i);
            if(visited.get(neigh) && neigh != parent){
                cycle = true;
                return;
            }
            else if(!visited.get(neigh)) dfs(adj, neigh, node, visited);
        }
    }
    public static boolean fun(int[][] edges, List<Boolean> visited, int V){
        List<List<Integer>> a = new ArrayList<>();
        for(int i = 0; i < V; i++){
            a.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++){
            int src = edges[i][0];
            int des = edges[i][1];
            a.get(src).add(des);
            a.get(des).add(src);
        }
        for(int i = 0; i < visited.size(); i++){
            if(!visited.get(i)) dfs(a, i, -1, visited);
        }
        return cycle;
    }
    
    public boolean isCycle(int V, int[][] edges) {
        List<Boolean> visited = new ArrayList<>();
        for(int i = 0; i < V; i++){
            visited.add(false);
        }
        cycle = false;
        return fun(edges, visited, V);
    }
}
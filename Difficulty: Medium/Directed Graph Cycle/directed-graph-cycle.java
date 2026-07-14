class Solution {
    static boolean cycle = false;
    public static void dfs(List<List<Integer>> adj, int node, List<Boolean> path, List<Boolean> visited){
        visited.set(node, true);
        path.set(node, true);
        for(int i = 0; i < adj.get(node).size(); i++){
            int neigh = adj.get(node).get(i);
            if(visited.get(neigh) && path.get(neigh)) cycle = true;
            if(!visited.get(neigh)) dfs(adj, neigh, path, visited);
        }
        path.set(node, false);
        
    }
    public static boolean fun(int [][] edges, List<Boolean> visited, List<Boolean> path, int V){
        List<List<Integer>> a = new ArrayList<>();
        for(int i = 0; i < V; i++){
            a.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++){
            int src = edges[i][0];
            int des = edges[i][1];
            a.get(src).add(des);
        }
        for(int i = 0; i < visited.size(); i++){
            if(!visited.get(i)) dfs(a, i, path, visited);
        }
        return cycle;
    }
    public boolean isCyclic(int V, int[][] edges) {
        List<Boolean> visited = new ArrayList<>();
        List<Boolean> path = new ArrayList<>();
        for(int i = 0; i < V; i++){
            visited.add(false);
            path.add(false);
        }
        cycle = false;
        return fun(edges, visited, path, V);
        
        
    }
}
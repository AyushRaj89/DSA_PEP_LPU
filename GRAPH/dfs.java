class Solution {
    
    public void dfsHelper(int src,
        ArrayList<ArrayList<Integer>>adj,
        boolean[] visited,
        ArrayList<Integer> ans){
        
        visited[src] = true;
        ans.add(src);
        for(int i : adj.get(src)){
            if(!visited[i]){
                dfsHelper(i, adj, visited, ans);
            }
        }
    }
    
    
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int v = adj.size();
        
        boolean[] visited = new boolean[v];
        dfsHelper(0, adj, visited, ans);
        
        return ans;
    }
}

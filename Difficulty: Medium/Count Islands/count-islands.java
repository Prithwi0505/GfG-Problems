class Solution {
    final int[] x = {-1, 1, 0, 0, -1, -1, 1, 1};
    final int[] y = {0, 0, -1, 1, -1, 1, -1, 1};
    
    public boolean valid(int m, int n, int i, int j){
        if(i < 0 || i >= m || j < 0 || j >= n) return false;
        return true;
    }
    public void dfs(char[][] a, int m, int n, int i, int j){
        a[i][j] = 'W';
        for(int k = 0; k < 8; k++){
            int row = i + x[k];
            int col = j + y[k];
            if(valid(m, n, row, col) && a[row][col] == 'L') dfs(a, m, n, row, col);
        }
    }
    public int countIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int island = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 'L'){
                    dfs(grid, m, n, i, j);
                    island++;
                }
            }
        }
        return island;
    }
}
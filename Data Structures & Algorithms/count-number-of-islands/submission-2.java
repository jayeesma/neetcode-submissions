class Solution {
    public int numIslands(char[][] grid) {
        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        int count=0;

        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]=='1') {
                    count++;
                    dfs(grid, dir, i, j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int[][] dirs, int i, int j) {
        if(i<0 || i>grid.length-1 ||j<0 || j> grid[0].length-1) {
            return;
        }

        if(grid[i][j]!='1') {
            return;
        }

        grid[i][j] = '0';

        for(int[] dir: dirs) {
            dfs(grid,dirs,i+dir[0],j+dir[1]);
        }
    }
}

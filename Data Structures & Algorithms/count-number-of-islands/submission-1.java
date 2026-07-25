class Solution {
    public int numIslands(char[][] grid) {
        int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        int count=0;
        // Set<String> visited = new HashSet<>();
        for(int i=0; i<grid.length;i++) {
            for(int j=0; j<grid[0].length;j++) {
                if(grid[i][j]=='1') {
                    count++;
                    dfs(grid, i, j, dirs);
                }
            }
        }
        return count;
    }

    private void dfs(char[][]grid, int i, int j, int[][]dirs) {
        if(i<0 || i>grid.length-1 || j<0 || j>grid[0].length-1) {
            return;
        }
        if(grid[i][j]!='1') {
            return;
        }

        grid[i][j] = '0';

        for(int[] dir: dirs) {
            dfs(grid, i+dir[0], j+dir[1], dirs);
        }
    }
}

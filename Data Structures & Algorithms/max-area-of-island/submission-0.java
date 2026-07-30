class Solution {
    int maxArea = 0;
    int newRow = 0;
    int newCol = 0;
    int area = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, dir, i, j);
                    // System.out.println("newRow:" + newRow 
                    // + "newCol:" + newCol 
                    // + "i:" + i 
                    // + "j:" + j );

                    System.out.println("Area"+area);
                    // int currentArea = (newRow - i) * (newCol - j);
                    // System.out.println("currentArea::" + currentArea);
                    maxArea = Math.max(maxArea, area);
                    area = 0;
                }
            }
        }
        return maxArea;
    }

    private void dfs(int[][] grid, int[][] dirs, int i, int j) {
        if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1) {
            return;
        }
        if (grid[i][j] != 1) {
            return;
        }
        grid[i][j] = 0;
        newRow = i;
        newCol = j;
        area++;

        for (int[] dir : dirs) {
            dfs(grid, dirs, i + dir[0], j + dir[1]);
        }
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        int count = 0;

        Set<String> visited = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !visited.contains(i+","+j)) {
                    count++;
                    dfs(i, j, directions, visited,grid);
                }
            }
        }

        return count;
    }

    private void dfs(int i, int j, int[][] directions, Set<String> visited, char[][] grid) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1) {
            return;
        }

        String s = i + "," + j;
        if (!visited.contains(s)) {
            visited.add(s);
        } else {
            return;
        }
        if (grid[i][j] != '1')
            return;

        for (int[] dir : directions) {
            dfs(dir[0] + i, dir[1]+j, directions, visited,grid);
        }
    }
}

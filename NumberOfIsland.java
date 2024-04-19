class Solution {
    public int numIslands(char[][] grid) {
        int count = 0; // Initialize island count

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') { // If we find an unvisited island part
                    count++; // Increment the island count
                    dfs(grid, i, j); // Perform DFS to mark all connected parts of the island
                }
            }
        }
        
        return count; // Return the total number of islands
    }

    private void dfs(char[][] grid, int i, int j) {
        // Check the bounds of the grid
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != '1') {
            return; // Return if out of bounds or cell is not an unvisited '1'
        }

        // Mark the cell as visited by changing '1' to '2'
        grid[i][j] = '2';
        
        // Perform DFS on the four directions: up, down, left, right
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }
}

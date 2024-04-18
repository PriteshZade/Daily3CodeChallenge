class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter=0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j =0 ; j < grid[0].length ; j++){
                
                if(grid[i][j]==1){
                    perimeter= perimeter+(4-(help(grid,i,j-1)+help(grid,i-1,j)+help(grid,i,j+1)+help(grid,i+1,j)));
                }
            }
        }
        return perimeter;
    }
    public int help(int[][]grid,int i , int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length){
            return 0;
        }else{
            return grid[i][j];
        }
    }
}
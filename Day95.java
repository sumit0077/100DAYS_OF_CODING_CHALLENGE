You are given an n x n grid where we place some 1 x 1 x 1 cubes that are axis-aligned with the x, y, and z axes.
Each value v = grid[i][j] represents a tower of v cubes placed on top of the cell (i, j).
We view the projection of these cubes onto the xy, yz, and zx planes.
A projection is like a shadow, that maps our 3-dimensional figure to a 2-dimensional plane. We are viewing the "shadow" when looking at the cubes from the top, the front, and the side.
Return the total area of all three projections.
class Solution {
    public int projectionArea(int[][] grid) {
        int a=0,x=0;
        for(int i=0;i<grid.length;i++)
        {
            int mr=Integer.MIN_VALUE;
            int mc=Integer.MIN_VALUE;
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]!=0)x+=1;//calculate number of non zero elements for area from top view
                if(grid[i][j]>mr)mr=grid[i][j];//calculate maximum element of each row
                if(grid[j][i]>mc)mc=grid[j][i];//calculate maximum element of each column
            }
            a+=mr+mc; //add max of each row and each column 
        }
        return (a+x);
    }
}

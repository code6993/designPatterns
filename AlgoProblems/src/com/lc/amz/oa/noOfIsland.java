package com.lc.amz.oa;

public class noOfIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
   public int noOfIsland(char[][] grid) {
	   if(null == grid || grid.length==0) {
		   return 0;
	   }
	   
	   int nr=grid.length;
	   int nc = grid[0].length;
	   
	   int result=0;
	   
	   for(int i=0;i<nr;i++) {
		   for(int j=0;j<nc;j++) {
			   if(grid[i][j]=='1') {
				   result++;
				   dfs(grid,i,j);
			   }
		   }
	   }
	   return result;
   }
   
   public void dfs(char[][] grid, int r,int c) {
	   int nr=grid.length;
	   int nc=grid[0].length;
	   
	   if(r>=nr || r<0 || c>=nc || c<0 || grid[r][c]=='0') {
		   return;
	   }
	   
	   grid[r][c]='0';
	   dfs(grid,r+1,c);
	   dfs(grid,r-1,c);
	   dfs(grid,r,c-1);
	   dfs(grid,r,c+1);
   }
}

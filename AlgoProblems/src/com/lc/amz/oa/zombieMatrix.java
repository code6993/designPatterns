package com.lc.amz.oa;

import java.util.LinkedList;
import java.util.Queue;

public class zombieMatrix {
    /*
     * Given a 2D grid, each cell is either a zombie 1 or a human 0. 
     * Zombies can turn adjacent (up/down/left/right) human beings into zombies every hour. 
     * Find out how many hours does it take to infect all humans?
     * 
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int zombieMatrixSolution(int [][] arr) {
		int totalNo = arr[0].length*arr.length;
		Queue<int[]> q = new LinkedList<int[]>();
		int cnt=0;int res=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==1) {
					q.offer(new int [] {i,j});
					cnt++;
				}
			}
		}
		int[][] directons = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
		while(!q.isEmpty()) {
			
			int size = q.size();
			if(cnt==totalNo) {
				return res;
			}
			
			
		}
	}

}

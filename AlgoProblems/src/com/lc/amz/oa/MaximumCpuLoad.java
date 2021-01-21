package com.lc.amz.oa;

import java.util.Arrays;
import java.util.*;

public class MaximumCpuLoad {
/*
 * 
 * We are given a list of Jobs. Each job has a Start time, an End time, and a CPU load when it is running. 
 * Our goal is to find the maximum CPU load at any time if all the jobs are running on the same machine.
 * 
 */
	public static void main(String[] args) {
		int[][] process = new int[][] {{1,4,3}, {7,9,6}, {2,5,4}};
		int ans = maxCpuLoad(process);
		System.out.print(ans);
	}
	
	
	private static int maxCpuLoad(int[][] process) {
		Arrays.sort(process,(a,b)->{
			return a[0]-b[0];
		});
		
		List<int[]> li = new LinkedList<int[]>();
		//li.add(process[0]);
		int ans=0;
		for(int[] p : process) {
			if(!li.isEmpty() && p[0]<li.get(li.size()-1)[1]) {
				li.get(li.size()-1)[1]=Math.max(p[1], li.get(li.size()-1)[1]);
				li.get(li.size()-1)[2]=p[2]+li.get(li.size()-1)[2];
				//ans= Math.max(ans, li.get(li.size()-1)[2]);
			}else {
				li.add(p);
			}
			ans= Math.max(ans, li.get(li.size()-1)[2]);
		}
		
		return ans;
		
	}
}

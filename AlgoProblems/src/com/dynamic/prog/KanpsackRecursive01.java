package com.dynamic.prog;


public class KanpsackRecursive01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prof = new int[] {1,6,10,16};
		int[] wt = new int[] {1,2,3,5};
		int pf = sloveKSRecursive(prof, wt, 7,0);
		System.out.println(pf);
		
	}

	public static int sloveKSRecursive(int[] profits,int[] weight,int cap, int idx) {
		if(idx>=weight.length || cap<0) {
			return 0;
		}
		
		int maxProfitWith = 0;
		if(cap-weight[idx]>=0) {
			maxProfitWith = profits[idx]+ sloveKSRecursive(profits, weight, cap-weight[idx], idx+1);
		}
		
		int maxProfitWithOut = sloveKSRecursive(profits, weight, cap, idx+1);
		
		return Math.max(maxProfitWith, maxProfitWithOut);
		
	}
	
}

package com.competetive.prg;

public class MaxSumSubArrayOfSizeK {

	//sliding window easy problem 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 1, 5, 1, 3, 2};
		int sum = solve(arr,3);
		System.out.print(sum);
	}
	
	private static int solve(int[] nums, int k) {
		
		int st=0;
		int sum=0;
		int maxSum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			if(i>k-1) {
				sum-=nums[st];
				maxSum=Math.max(maxSum,sum);
				st++;
			}
		}
		
		return maxSum;
		
	}

}

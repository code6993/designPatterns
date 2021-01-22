package com.lc.amz.oa;

public class CyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[]{3,2,1};
		cyclicSort(num);
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}
	
	private static void cyclicSort(int[] nums) {
		
		int i =0;
		
		while(i<nums.length) {
			int j=nums[i]-1;
			if(nums[i]!=nums[j]) {
				int t = nums[i];
				nums[i]=nums[j];
				nums[j]=t;
			}else {
				i++;
			}
		}
		
		
		
	}
	
}

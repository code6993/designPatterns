package com.dynamic.prog;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution  {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int tc = myInput.nextInt();
		int k=1;
		while(tc>0) {
			tc--;
			
			int size = myInput.nextInt();
			int[] arr = new int[size];
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=myInput.nextInt();
			}
			
			int cost= cost(arr)-1;
			System.out.println("Case #"+k+": "+cost);
			k++;
			
		}
   	}
	
	private static int cost(int[] nums) {
		int cost = 0;
		
		for(int i=0;i<nums.length;i++) {
			int minj=i;
			int minE= nums[i];
			for(int j=i+1;j<nums.length;j++) {
				if(minE>nums[j]) {
					minE=nums[j];
					minj=j;
				}
			}
			
			int tCost= rev(nums,i,minj);
			cost+=tCost;

		}
		
		return cost;
		
		
		
	}

	
	private static int rev(int[] nums,int i,int j) {
		int res = j-i+1;
		while(i<j) {
			int t = nums[i];
			nums[i]=nums[j];
			nums[j]=t;
			i++;
			j--;
		}
		
		return res;
	}
}

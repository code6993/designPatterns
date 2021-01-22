package com.lc.amz.oa;

public class MissingNumCyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[]{4,0,3,1};
		int i=findNum(num);
		System.out.print(i);
		

	}
	
	private static int findNum(int[] num) {
		int i=0;
		
		while(i<num.length) {
			if(num[i]<num.length && num[i]!=num[num[i]]) {
				int t = num[i];
				num[i]=num[t];
				num[num[i]]=t;
			}else {
				i++;
			}
		}
		
		for(int j =0;j<num.length;j++) {
			if(num[j]!=j)return j;
		}
		return -1;
	}
	private static void swap(int[] num ,int i,int j) {
		int t = num[i];
		num[i]=num[j];
		num[j]=t;
		
	}
}

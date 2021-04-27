package com.experiment;

public class MINCOIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(change(28));
	}
	
	private static int change(int n) {
		int cnt=0;
		while(n>10) {
			n-=10;
			cnt++;
		}
		while(n>5) {
			n-=5;
			cnt++;
		}
		while(n>0) {
			n-=1;
			cnt++;
		}
		return cnt;
	}

}

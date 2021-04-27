package com.experiment;

public class IsPowOf2 {
	public static void main(String[] args) {
		
		int i=32;
		while(i>0) {
		int k = i&(i-1);
		if(k==0) {
			System.out.println(i+" Is Pow of 2");
		}
		else {
			System.out.println(i+" is Not pow of 2");
		}
		i--;
		}
		
		i=0;
		
		while(i<=32) {
			System.out.println("i=="+i+" i&(i+1)= "+(i&(i+1)));
			i++;
		}
		
		for(int j=1;j<100;j++) {
			int k = j*3;
			System.out.println("3*"+j+" ="+k+" which in binary is "+Integer.toBinaryString(k));
			
		}
	}
}

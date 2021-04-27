package com.experiment;

public class BitXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		
		while(n<=11) {
			System.out.println(n+" to Binary -> "+Integer.toBinaryString(n) + "  \nn^(n+1) - > "+(n^(n+1))+" which in binary is " + Integer.toBinaryString(n^(n+1)));
			n++;
		}
		
		int k = 0;
		n=1;
		while(n<=10) {
			k^=n;
			System.out.println("k^n=="+k+" which in Binary is "+Integer.toBinaryString(k)+" n is "+n+ " which in Binary is "+Integer.toBinaryString(n));
			n++;
		}
		n-=2;
		while(n>=0) {
			k^=n;
			System.out.println("------k^n=="+k+" which in Binary is "+Integer.toBinaryString(k)+" n is "+n+ " which in Binary is "+Integer.toBinaryString(n));
			n--;
		}
		
		System.out.println("\n\nA=5 represented binary 101? "+Integer.toBinaryString(5)+ " 5&(5-1)= "+ (5&4));
		
		int i =10;
		int sum=0;
		while(i>0) {
			System.out.println("\ni="+i+" and i&(i-1)="+ (i&(i-1)));
			sum+=(i&(i-1));
			System.out.println("Sum of i(i-1)="+ sum);
			i--;
		}
	}

}

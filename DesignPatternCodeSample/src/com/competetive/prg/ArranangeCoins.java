package com.competetive.prg;

public class ArranangeCoins {
	/*
	 * You have a total of n coins that you want to form in a staircase shape, where
	 * every k-th row must have exactly k coins.
	 * 
	 * Given n, find the total number of full staircase rows that can be formed.
	 * 
	 * n is a non-negative integer and fits within the range of a 32-bit signed
	 * intege
	 * 
	 * Classical question 
	 * 
	 * Link- https://leetcode.com/explore/featured/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3377/
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 9;
		System.out.println( (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5));

	}

}

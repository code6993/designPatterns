package com.lc.amz.oa;

import java.util.*;

public class PreviousGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = {10, 4, 2, 20, 40, 12, 30}; 
		  
		  previousGE(arr); 
		  
		  for(int i : arr) {
			  System.out.print(i+" ");
		  }
	}
	
	
	private static int[] previousGE(int[] arr) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(arr[0]);
		arr[0]=-1;
		
		for(int i=1;i<arr.length;i++) {
			if(st.peek()>arr[i]) {
				int j = st.peek();
				st.push(arr[i]);
				arr[i]=j;
			}else {
				while(!st.isEmpty() && st.peek()<arr[i]) {
					st.pop();
				}
				int j= arr[i];
				if(st.isEmpty()) {
					arr[i]=-1;
				}else {
					arr[i]=st.peek();
				}
				st.push(j);
				
			}
		}
		
		return arr;
	}
}

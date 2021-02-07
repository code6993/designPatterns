package com.lc.amz.oa;

public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "/a//b////c/d//././/..";
		
		String[] s2  = s.split("/");
		
		for (String s1 : s2) {
			System.out.println("---> "+s1);
		}
	}

}

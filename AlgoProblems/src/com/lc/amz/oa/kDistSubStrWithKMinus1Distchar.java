package com.lc.amz.oa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class kDistSubStrWithKMinus1Distchar {
	 public static List<String> solve(String s,int k){
		if(null==s || s.length()==0) {
			return null;
		}
		List<String> result = new ArrayList<String>();
		int low= 0;
		while(low+k <=s.length()) {
			String subStr= s.substring(low,low+k);
			if(hasKMinus1DistChar(subStr,k)) {
				result.add(subStr);
			}
			low++;
		}
		 
		return result;
		 
		 
	}
	 
	 public static Boolean hasKMinus1DistChar(String s,int n) {
		 Set<String> st = new HashSet<String>();
		 
		 for(int i=0;i<s.length();i++) {
			 char k = s.charAt(i);
			 st.add(Character.toString(k));
		 }
		 
		Boolean value= st.size()==n-1 ? true:false;
		return value;
		 
	 }
	 
	 public static void main(String[] args) {
		 String s= "awaglk";
		 int k = 4;
		 
		 List<String> ls= solve(s,4);
		 
		 for(String s2 : ls ) {
			 System.out.println(s2);
		 }
	 }
}

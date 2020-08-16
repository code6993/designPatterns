package com.lc.amz.oa;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class kCharDistSubStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "awaglknagawunagwkwagl";
        int k=4;
        List<String> st=kDistSubStrSoln(s,k);
        for(String stk: st) {
        	System.out.println(stk);
        }
	}

	
	public static List<String> kDistSubStrSoln(String s,int k){
		int loIdx=0;
		Set<String> st=new LinkedHashSet<String>();
		List<String> result = new LinkedList<String>();
		
		while(loIdx+k<=s.length()) {
			String j= s.substring(loIdx, loIdx+k);
			char[] strCharVal = j.toCharArray();
			if(hasDistintChar(strCharVal)) {
				st.add(j);
			}
			loIdx++;
		}
		for(String str : st) {
			result.add(str);
		}
		return result;
	}
	
	public static boolean hasDistintChar(char[] arr) {
		
		int[] distMap = new int[26];
		for(int i=0;i<arr.length;i++) {
			distMap[arr[i]-'a']++;
		}
		for(int i=0;i<26;i++) {
			if(distMap[i]>1) {
				return false;
			}
		}
		return true;
	}
}

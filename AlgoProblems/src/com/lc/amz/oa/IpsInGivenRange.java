package com.lc.amz.oa;

import java.util.ArrayList;
import java.util.List;

public class IpsInGivenRange {
	public static List<String> findAllIPAdresses(String start, String end) {
		 List<String> allips = new ArrayList<String>();
		    allips.add(start);
		    
		    String[] arr = start.split("\\.");
		    
		    while(!start.equalsIgnoreCase(end)){
		        int addNum = 1;
		        
		        for(int i = arr.length-1; i>=0; --i){
		            Integer p = Integer.parseInt(arr[i]);
		            if(p + addNum <= 255) {p = p + addNum; arr[i] = p.toString(); addNum = 0;}
		            else{ arr[i] = "0"; addNum = 1;}
		        }
		        StringBuilder sb = new StringBuilder();
		        for(String s : arr) {
		        	sb.append(s+".");
		        }
		        start = sb.substring(0, sb.length()-1);
		        //System.out.println(start);
		        allips.add(start);
		    }
		    return allips;
	}

	
	
	public static void main(String[] Args) {
		String start = "192.168.0.254", end = "192.168.1.2";
		
		List<String> ls = findAllIPAdresses(start,end);
		
		for(String s : ls) {
			System.out.println(s);
		}
	}
}

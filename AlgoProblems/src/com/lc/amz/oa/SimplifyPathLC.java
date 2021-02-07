package com.lc.amz.oa;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class SimplifyPathLC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String s = "/home/"; System.out.println(simplifyPath(s)); String s2 = "/../";
		  System.out.println(simplifyPath(s2)); String s3 = "/home//foo/";
		  System.out.println(simplifyPath(s3)); String s4 = "/a/./b/../../c/";
		  System.out.println(simplifyPath(s4));
		 
		String s5 = "/a//b////c/d//././/..";
		System.out.println(simplifyPath(s5));
	}
	
	
	public static String simplifyPath(String path) {
        Stack<String> q = new Stack<String>();
        
        String[] splits = path.split("/");
        
        for(String s : splits) {
        	if(null != s && !s.isEmpty()) {
        		if(s.equals("..") && !q.isEmpty()) {
        			q.pop();
        		}
        		else if(!s.equals(".") && !s.equals("..")) {
        			q.push(s);
        		}
        	}
        }
        
        List<String> ls = new LinkedList<String>();
        
        while(!q.isEmpty()) {
        	ls.add(q.peek());
        	q.pop();
        }
        
       Collections.reverse(ls);
        
        StringBuilder sb = new StringBuilder();
       
        for(int i = 0;i<ls.size();i++) {
        	sb.append("/"+ls.get(i));
        }
        
        return sb.length()==0?"/": sb.toString();
    }

}

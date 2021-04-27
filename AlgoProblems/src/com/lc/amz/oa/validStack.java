package com.lc.amz.oa;

import java.util.Stack;

public class validStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validateStackSequences(new int[] {1,2,3,4,5}, new int[] {4,3,5,1,2}));

	}

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        int id1=0;
        int id2=0;
        
        Stack<Integer> st = new Stack<Integer>();
        try {
        	 while(id1<=pushed.length && id2<popped.length){
             	
             	
                 if(!st.isEmpty() && st.peek().intValue()==popped[id2]){
                     st.pop();
                     id2++;
                    // id1++;
                 }else {
                     st.push(pushed[id1++]);
                 }
                 
              //   System.out.println(id1+" -- "+id2+" -- "+ pushed[id1]+" -- pop --"+popped[id2]);
             }
        }catch(Exception ex) {
        	return false;
        }
       
        
        return st.isEmpty();
    }
}

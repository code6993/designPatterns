package com.lc.amz.oa;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class secretFruitList {
	
	//one bug: you need to check from next index from where current row exist
	 public static int winPrize(String[][] codeList, String[] shoppingCart) {
		 if(null== codeList && codeList.length==0 ) {
			 return -1;
		 }
		 if(null== shoppingCart && shoppingCart.length==0 ) {
			 return -1;
		 }
		 int flg=0;
		 int valRowCtr=0;
		 for(int i=codeList.length-1;i>=0;i--) {
			 //get the current row
			 String[] codeListRow = codeList[i];
			 int k=0; //pointer to track shopping cart list
			 int l=0; //pointer to track code list row
			 int itr= shoppingCart.length - codeListRow.length;
			 int trgt = 0;
			 
			 //To track the term "anything" is used to allow for any type of fruit to appear in that location within the group.
			 Set<String> st = new HashSet<String>();
			 for(int idx= 0;idx<codeListRow.length;idx++) {
				 if(codeListRow[idx].equalsIgnoreCase("anything")) {
					 continue;
				 }
				 else {
					 st.add(codeListRow[idx]);
				 }
			 }
			 
			 for(int j=0;j<itr && k<shoppingCart.length && l<codeList.length;j++) {
				 String promoFruit= codeListRow[l];
				 String custFruit= shoppingCart[k];
				 if(promoFruit.equalsIgnoreCase(custFruit)) {
					 k++;l++;
					 trgt++;
				 }
				 else if(promoFruit.equalsIgnoreCase("anything")) {
					if(st.contains(custFruit)) {
						 k++;l++;
						 trgt++;
					}
				 }
				 else {
					 l=0;trgt = 0;k++; //currently match may not exist but can be preset in later list;
				 }
			 }
			 if(trgt==codeListRow.length) {
				 valRowCtr++;
				
			 }
		 }
		 return valRowCtr==codeList.length ? 1:0;
	 }
	 
	 
	

	 public static void test(String[][] codeList, String[] shoppingCart, int expect) {
	        System.out.println(winPrize(codeList, shoppingCart) == expect);
	    }
	 public static void main(String[] args) {
	        // test cases
	        String[][] codeList1 = { { "apple", "anything" }, { "banana", "anything", "banana" } };
	        String[] shoppingCart1 = {"orange", "apple", "banana", "banana", "orange", "banana"};
	        String[][] codeList2 = {{"apple", "apple"}, {"banana", "anything", "banana"}} ;
	        String[] shoppingCart2 = {"orange", "apple", "apple", "banana", "orange", "banana"};
	        // test
	        test(codeList1, shoppingCart1, 0);
	        test(codeList2,shoppingCart2,0);
			
		
			
				 
			 	    }
}

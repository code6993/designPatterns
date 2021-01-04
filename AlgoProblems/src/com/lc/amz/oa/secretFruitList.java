package com.lc.amz.oa;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class secretFruitList {
	
	//one bug: you need to check from next index from where current row exist
	 public static int winPrize(String[][] codeList, String[] shoppingCart) {
		 if(null == codeList || codeList.length ==0) {
			 return 1;
		 }
		 if(null == shoppingCart || shoppingCart.length==0) {
			 return 0;
		 }
		 
		 //The Problem is to iterate all over codelist and see if the pattern is present in the shopping cart
		 int i=0;
		 int j=0;
		 while(i<codeList.length && j+codeList[i].length <=shoppingCart.length) {
			 Boolean matchExist= true;
			 for(int k=0;k<codeList[i].length;k++) {
				 if(!codeList[i][k].equals("anything") && !shoppingCart[j+k].equals(codeList[i][k])) {
					 matchExist=false;
					 break;
				 }
			 }
			 if(matchExist) {
				 j+=codeList[i].length;
				 i++;
			 }else {
				 j++;
			 }
		 }
		 return i==codeList.length ? 1:0;
	 }
	 
	 
	

	 public static void test(String[][] codeList, String[] shoppingCart, int expect) {
	        System.out.println(winPrize(codeList, shoppingCart) == expect);
	    }
	 public static void main(String[] args) {
	        
	        String[][] codeList1 = { { "apple", "apple" }, { "banana", "anything", "banana" } };
	        String[] shoppingCart1 = {"orange", "apple", "apple", "banana", "orange", "banana"};
	        String[][] codeList2 = { { "apple", "apple" }, { "banana", "anything", "banana" } };
	        String[] shoppingCart2 = {"banana", "orange", "banana", "apple", "apple"};
	        String[][] codeList3 = { { "apple", "apple" }, { "banana", "anything", "banana" } };
	        String[] shoppingCart3 = {"apple", "banana", "apple", "banana", "orange", "banana"};
	        String[][] codeList4 = { { "apple", "apple" }, { "apple", "apple", "banana" } };
	        String[] shoppingCart4 = {"apple", "apple", "apple", "banana"};
	        String[][] codeList5 = { { "apple", "apple" }, { "banana", "anything", "banana" } };
	        String[] shoppingCart5 = {"orange", "apple", "apple", "banana", "orange", "banana"};
	        String[][] codeList6 = { { "apple", "apple" }, { "banana", "anything", "banana" }  };
	        String[] shoppingCart6 = {"apple", "apple", "orange", "orange", "banana", "apple", "banana", "banana"};
	        String[][] codeList7= { { "anything", "apple" }, { "banana", "anything", "banana" }  };
	        String[] shoppingCart7 = {"orange", "grapes", "apple", "orange", "orange", "banana", "apple", "banana", "banana"};
	        String[][] codeList8 = {{"apple", "orange"}, {"orange", "banana", "orange"}};
	        String[] shoppingCart8 = {"apple", "orange", "banana", "orange", "orange", "banana", "orange", "grape"};
	        String[][] codeList9= { { "anything", "anything", "anything", "apple" }, { "banana", "anything", "banana" }  };
	        String[] shoppingCart9 = {"orange", "apple", "banana", "orange", "apple", "orange", "orange", "banana", "apple", "banana"};

	        // test
	        test(codeList1, shoppingCart1, 1);
	        test(codeList2, shoppingCart2, 0);
	        test(codeList3, shoppingCart3, 0);
	        test(codeList4, shoppingCart4, 0);
	        test(codeList5, shoppingCart5, 1);
	        test(codeList6, shoppingCart6, 1);
	        test(codeList7, shoppingCart7, 1);
	        test(codeList8, shoppingCart8, 1);
	        test(codeList9, shoppingCart9, 1);
			
				 
			 	    }
}

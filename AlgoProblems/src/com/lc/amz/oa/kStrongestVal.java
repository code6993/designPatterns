package com.lc.amz.oa;

import java.util.PriorityQueue;

public class kStrongestVal {

	  public static class Element{
	        int val;
	        int idx;
	        Element(int val,int idx){
	            this.val=val;
	            this.idx=idx;
	        }
	    }
	    public static int[] getStrongest(int[] arr, int k) {
	        int med = arr[(arr.length-1)/2];
	        PriorityQueue<Element> pq = new PriorityQueue<Element>((a,b)->{
	            return b.val==a.val? b.idx-a.idx:Math.abs(a.val-med)-Math.abs(b.val-med);
	        });
	        
	        for(int i = 0;i<arr.length;i++){
	            pq.offer(new Element(arr[i],i));
	        }
	        
	        int[] res = new int[k];
	        
	        for(int i=0;i<res.length;i++){
	            res[i]=pq.poll().val;
	        }
	        
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.ceil(1.14));
		//2.236
		System.out.println(Math.ceil(2.236));
		System.out.println(Integer.MAX_VALUE);

	}

}

package com.lc.amz.oa;
import com.lc.amz.oa.MyCircularQueue;
public class MyCircularQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCircularQueue obj =new MyCircularQueue(3);

		boolean param_1 = obj.enQueue(2);
	//	boolean param_2 = obj.deQueue();
		int param_3 = obj.Front();
		int param_4 = obj.Rear();
		boolean param_5 = obj.isEmpty();
		boolean param_6 = obj.isFull();
		System.out.println("Done!!");
		
	}

}

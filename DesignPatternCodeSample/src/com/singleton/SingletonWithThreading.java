package com.singleton;

public class SingletonWithThreading {

	
	private static SingletonWithThreading sObj ;
	
	private SingletonWithThreading() {   
		
	}
	
	/*
	 * The easier way to create a thread-safe singleton class is to make the 
	 * global access
	 *  method synchronized so that only one thread can execute this method at a time.
	 */
//	  public static synchronized SingletonWithThreading getsObj() {
//		if(null == sObj) {
//			sObj = new SingletonWithThreading();
//		}
//		return sObj;
//	  }
	
	/*
	 * Another way:
	 * 
	 * 
	 */
//	public static SingletonWithThreading getsObj2nd() {
//		if(null == sObj) {
//     	synchronized(SingletonWithThreading.class){
//		sObj = new SingletonWithThreading();
//	     }
//      }
//	    return sObj;
//	}
	
	
	/*
	 * The above two method adds over head to the performance, i.e. reduces performance.
	 * Also, Lets say Thread T1 and Thread T2 have both executed if ==null stamement
	 * Now both threads have identified the instance variable as null and thus assume they must create an instance
	 * They sequentially go to a synchronized block and create the instances.
	 * In the end, we have two instances in our application.
	 * For this what we do is to employ double checking
	 * In this the synchronized block is used
	 * inside the if condition with an additional check 
	 * to ensure that only one instance of the singleton class is created.
	 * 
	 */
	public static SingletonWithThreading getsObj() {
		if(null == sObj) {
			synchronized(SingletonWithThreading.class) {
				if(null == sObj) {
					sObj= new SingletonWithThreading();
				}
			}
		}
		return sObj;
	}
}

package com.singleton;

//3 concepts : Simple single ton Pattern
//             1-> Simple Singleton Pattern
//             2-> Singleton Pattern with Multithreading
//             3-> Singleton Pattern with Serialization
//How Reflections destroy singleton pattern and how to overcome with the help of enum
//How serialization destroys singleton pattern and how to overcome with implementing read resolve method
public class SingletonImplementationSimple {
	
	/*
	 * Method 1 of initalization 
	 * private static volatile EagerSingleton instance = new EagerSingleton(); 
	 * not using above eagar initialization as in thtis
	 * object is created at time of class loading and
	 * client application might not be using it.
	 */
	
	
	
	/*
	 * Method 2 of initalization :
	 * static{ try{ instance = new StaticBlockSingleton(); }catch(Exception e){
	 * throw new
	 * RuntimeException("Exception occured in creating singleton instance"); } }
	 * 
	 * provides the option for exception handling.
	 */
	
	
	/*
	 * Method 3 Lazy initalization : 
	 * public static LazyInitializedSingleton getInstance(){ if(instance == null){
	 * instance = new LazyInitializedSingleton(); } return instance; }
	 */
	
	private static SingletonImplementationSimple singleObj;
	//to make sure that only one object of the given class exist
	//make the default constructor private
	private SingletonImplementationSimple() {
		
	}
	
	//to access this single object you create getters and no setters
	public static SingletonImplementationSimple getSingleObj() {
		return singleObj;
	}
	
}

package com.singleton;

public class ClonePreventedSingleton {
     
	/*
	 * To prevent an object from cloning, 
	 * We simply override clone method and throw CloneNotSupported Exception.
	 * 
	 */
	private ClonePreventedSingleton () {
		
	}
	
	private static class ClonePreventedSingletonHelper {
		private static ClonePreventedSingleton sObj = new ClonePreventedSingleton();
	}
	
	public ClonePreventedSingleton getInstance() {
		return ClonePreventedSingletonHelper.sObj;
	}
	
	@Override
	  protected Object clone() throws CloneNotSupportedException  
	  { 
	    throw new CloneNotSupportedException(); 
	  } 
}

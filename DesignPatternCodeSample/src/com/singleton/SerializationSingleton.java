package com.singleton;

import java.io.Serializable;

public class SerializationSingleton implements Serializable{
	
	private static final long serialVersionUID = -7604766932017737115L;
	
	private SerializationSingleton() {
		
	}
	
	//Implementing with BillPughSingleton
	
	private static class SerializationSingletonHelper{
		private static SerializationSingleton sObj = new SerializationSingleton();
	}

	
//	public SerializationSingleton getInstance() {
//		return SerializationSingletonHelper.sObj;
//	}
	
	/*
	 * In order to prevent creation of new object at time of Deserialization, 
	 * we implement read resolve method.
	 */
	
	protected Object readResolve() 
    { 
        return  SerializationSingletonHelper.sObj;
    }
}

package com.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
        { 
			 SerializationSingleton instanceOne = SerializationSingleton.getInstance();
			 ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		        out.writeObject(instanceOne);
		        out.close();
		        //deserailize from file to object
		        ObjectInput in = new ObjectInputStream(new FileInputStream(
		                "filename.ser"));
		        
		        Boolean f = false;
		        if(Boolean.TRUE.equals(f)) {
		        	System.out.println("kjdhsalkshal");
		        }
		        else {
		        	System.out.println("bgrekljref");
		        }
		        SerializationSingleton instanceTwo = (SerializationSingleton) in.readObject();
		        in.close();
		        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
		        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
        }  
          
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 

	}

}

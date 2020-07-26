package com.singleton;

public enum EnumSingletonToPreventReflection {
	
	
	/*
	 * To Prevent breaking of singleton by reflection
	 * We can use Enum as Java ensures that any enum value is instantiated only once in a Java program
	 * Drawback - Doesnot allow Lazy initalization
	 */
      sObj;
	
}

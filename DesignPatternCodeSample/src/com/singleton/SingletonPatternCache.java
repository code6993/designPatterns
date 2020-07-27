package com.singleton;

import java.util.HashMap;
import java.util.Map;

public class SingletonPatternCache implements SingletonCache {

	private  SingletonPatternCache() {

	}
	
	private static class SingletonPatternCacheHelper {
		private static Map<Object,Object> sObj = new HashMap<Object,Object>();
	}
	
	@Override
	public void put(Object key, Object value) {
		SingletonPatternCacheHelper.sObj.put(key, value);
		
	}

	@Override
	public Object get(Object key) {
		return SingletonPatternCacheHelper.sObj.get(key);
	}

}

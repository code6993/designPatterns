package com.singleton;

public interface SingletonCache<K,V> {

	/*
	 * Here is Simple Exmaple of cacheing using Singleton Pattern
	 * 
	 * 
	 */
	public void put(K key, V value);
	public V get(K key);
	
}

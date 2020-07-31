package com.singleton;

import java.util.Deque;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LRUCacheFullImplemetation {

	private LRUCacheFullImplemetation() {
		
	}
	/*
	 * We use two data structures to implement an LRU Cache.
	 * 
	 * Queue which is implemented using a doubly linked list. The maximum size of
	 * the queue will be equal to the total number of frames available (cache size).
	 * The most recently used pages will be near front end and least recently pages
	 * will be near the rear end. A Hash with page number as key and address of the
	 * corresponding queue node as value.
	 */
	
	private static class LRUCacheFullImplemetationHelper{
		private static Map<Object,Object> keyMap = new ConcurrentHashMap<Object,Object>();
		private Deque<Integer> doublyQueue;
	}
}

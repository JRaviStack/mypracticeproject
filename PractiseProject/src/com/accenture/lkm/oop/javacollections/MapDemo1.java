package com.accenture.lkm.oop.javacollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo1 {
	
	public static void main(String[] args) {
		
		/*
		 * Map<Integer, String> map = new HashMap<Integer, String>(); Map<Integer,
		 * String> map1 = new LinkedHashMap<Integer, String>();
		 */
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1001, "Kartik");
		map.put(1002, "Hitesh");
		map.put(1003, "Hitesh");
		map.put(1004, "Nitin");
		map.put(1005, "Nitesh");
		map.put(1006, null);
		map.put(1007, null);
		System.out.println(map);
		System.out.println(map.containsValue("Nitesh"));
		for (Map.Entry<Integer, String> ele : map.entrySet()) {
			System.out.println(ele);
		}
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		
	}

}

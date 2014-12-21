package com.test.map;

import java.util.HashMap;
import java.util.Map;

public class MapNegativeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("test", "test");
		map.put(String.valueOf(-1), "Hello");
		for(Map.Entry<String, String> entry:map.entrySet()){
			System.out.println("Key:"+entry.getKey());
			System.out.println("Value:"+entry.getValue());
		}
	}

}

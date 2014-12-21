package com.test.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CopyOfMapValuesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> mapStr = new HashMap<String,String>();
		
			mapStr.put("6", "I");
			mapStr.put("6", "J");
			mapStr.put("6", "K");
			mapStr.put("6", "L");
		Iterator<Map.Entry<String, String>> entryIter = mapStr.entrySet().iterator();
	
		for(Entry<String, String> str:mapStr.entrySet()){
			System.out.println("Key="+str.getKey()+",Value="+str.getValue());
		}
	}

}

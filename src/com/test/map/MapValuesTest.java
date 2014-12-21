package com.test.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapValuesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> mapStr = new HashMap<String,String>();
			mapStr.put("1", "A");
			mapStr.put("2", "B");
			mapStr.put("3", "C");
			mapStr.put("4", "D");
			mapStr.put("5", "E");
			mapStr.put("6", "F");
			mapStr.put("6", "H");
			mapStr.put("6", "I");
			mapStr.put("6", "J");
			mapStr.put("6", "K");
			mapStr.put("6", "L");
		Iterator<Map.Entry<String, String>> entryIter = mapStr.entrySet().iterator();
		while(entryIter.hasNext()){
			Map.Entry<String, String> tempEntry = entryIter.next();
			System.out.println("Key="+tempEntry.getKey()+",Value="+tempEntry.getValue());
		}
		for(Entry<String, String> str:mapStr.entrySet()){
			System.out.println("Key="+str.getKey()+",Value="+str.getValue());
		}
	}

}

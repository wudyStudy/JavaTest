package com.test.collections;

import java.util.ArrayList;

public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		System.out.println(arrayList.add("F"));
		System.out.println(arrayList.contains("A"));
		System.out.println(arrayList.indexOf("E"));
		System.out.println(arrayList.contains("A"));
		System.out.println(arrayList.clone());
		System.out.println(arrayList.lastIndexOf("D"));
		System.out.println(arrayList.remove(1));
		System.out.println(arrayList.remove("A"));
		arrayList.trimToSize();
		arrayList.add(1, "N");
		arrayList.clear();
		
	}

}

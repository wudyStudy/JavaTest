package com.test.collections;

import java.util.LinkedList;

public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList = new  LinkedList<String>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		linkedList.add("E");
		linkedList.add("F");
		linkedList.addFirst("G");
		linkedList.addLast("H");
		System.out.println(linkedList.element());
		System.out.println(linkedList.contains("A"));
		System.out.println(linkedList.element());
		System.out.println(linkedList.get(4));
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		System.out.println(linkedList.indexOf("C"));
		System.out.println(linkedList.contains("D"));
		System.out.println(linkedList.offer("F"));
		System.out.println(linkedList.isEmpty());
		System.out.println(linkedList.iterator().next());
		linkedList.push("N") ;
	}

}

package com.test.linkedList;

import java.util.LinkedList;

public class ClassLLinkedListTest { 
	
	private int id;
	private String name;
	
	public ClassLLinkedListTest(int id,String name){
		this.id = id;
		this.name = name;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<ClassLLinkedListTest> temp = new LinkedList<ClassLLinkedListTest>();
		for(int index = 0;index < 10;index++){
			ClassLLinkedListTest test = new ClassLLinkedListTest(index,"name"+index);
			temp.add(test);
		}
		for(ClassLLinkedListTest t: temp){
			System.out.println("ID:"+t.getId()+";Name:"+t.getName());
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

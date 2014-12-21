package com.test.collections;

import java.util.Stack;

public class StackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		stack.add("1");
		stack.add("2");
		stack.add("3");
		stack.add("4");
		stack.add("5");
		stack.add("6");
		stack.add("7");
		
		System.out.println(stack.size()+"==="+stack.capacity());
		System.out.println(stack.elementAt(0));
		System.out.println(stack.get(0));
		System.out.println(stack.peek());
		System.out.println(stack.push("8"));
		//System.out.println(stack.pop());
		System.out.println(stack.iterator());
		System.out.println(stack.empty());
		System.out.println(stack.isEmpty());
		System.out.println(stack.search("4"));
	}

}

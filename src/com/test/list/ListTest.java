package com.test.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);
			list.add(6);
			list.add(7);
			list.add(8);
		System.out.println(list.toString());
		
		List<Student> tempList = new ArrayList<Student>();
		for(int i = 0;i<10;i++){
			Student stu = new Student();
			stu.setId(i);
			stu.setName("Name"+i);
			stu.setSex('F');
			tempList.add(stu);
		}
		System.out.println(tempList.toString());
	}

}

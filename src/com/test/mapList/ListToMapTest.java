package com.test.mapList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMapTest { 
	
	public static void  main(String []args){
		
		List<Student> studentList = new ArrayList<Student>();
		for(int i = 0;i<10;i++){
			Student stu = new Student(i+1,"����"+(i+1)+"��","����ѧԺ"+(i+1)+"��");
			studentList.add(stu);
		}
		for(int i = 0;i<studentList.size();i++){
			Map map = (Map) studentList.get(i);
			System.out.print("Id:"+map.get("id"));
			System.out.print("Name:"+map.get("name"));
			System.out.println("School:"+map.get("school"));
		}
	}

}

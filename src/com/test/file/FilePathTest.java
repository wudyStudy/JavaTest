package com.test.file;

import java.io.File;

public class FilePathTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String flePath = "D:\\officeDataLocal\\1000\\g_roam_oper_code\\down";
		File file = new File(flePath+"\\test.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getTotalSpace());
		System.out.println(file.getParentFile());
	}

}

package com.test.cast;

public class ArrTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "H;1;000;";
		String []arr = line.split(";");
		for(String temp:arr){
			System.out.println(temp);
			System.out.println(arr.length);
		}
	}

}

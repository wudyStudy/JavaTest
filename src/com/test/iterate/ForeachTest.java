package com.test.iterate;

public class ForeachTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  []tempArr = {1,3,4,5,6,7,8,7,5};
		for(int temp :tempArr){
			System.out.println(temp);
		}
		
		System.out.println("********************");
		
		for(int temp :tempArr){
			if(6 == temp){
				break;
			}
			System.out.print(temp);
		}
	}

}

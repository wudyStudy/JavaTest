package com.test.exception;

public class ExceptionTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			int temp = 23/0;
			System.out.println("�Ƿ���Ե���������");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(11111);
			throw new Exception("����");
		}
		System.out.println(222222222);
	}

}

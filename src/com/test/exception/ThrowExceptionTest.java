package com.test.exception;

public class ThrowExceptionTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			int tempResult = 10/0;
			System.out.println("1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Thread.sleep(2000);
			System.out.println("2");
			Thread.sleep(2000);
			e.printStackTrace();
			System.out.println("3");
			
			Thread.sleep(2000);
			throw new Exception("XXXXXXX",e);
		}finally{
			Thread.sleep(2000);
			System.out.println("4");
		}
			System.out.println("5");
	}

}

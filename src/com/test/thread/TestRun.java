package com.test.thread;

public class TestRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new RunMethod().start();
		new RunMethod().run();
		new RunMethod().run();
		new RunMethod().run();
		new RunMethod().run();
		new RunMethod().run();
		new RunMethod().run();
		new RunMethod().run();
		new RunMethod().run();
		new RunMethod().run();
		new RunMethod().run();
		new RunMethod().run();
	}
	

	 

}
 class RunMethod extends Thread{
	public void run(){
		System.out.println("This is Run  method");
	}
	
}

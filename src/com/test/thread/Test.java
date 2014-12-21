package com.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class Test
{
	public static void main(String[] args)
	{
		ExecutorService pool = Executors.newFixedThreadPool(2);
		Runnable t1 = new MyRunnable("����", 2000);
		Runnable t2 = new MyRunnable("����", 3600);
		Runnable t3 = new MyRunnable("����", 2700);
		Runnable t4 = new MyRunnable("����", 600);
		Runnable t5 = new MyRunnable("��ţ", 1300);
		Runnable t6 = new MyRunnable("����", 800);
		//ִ�и����߳�
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);
		pool.execute(t6);
		//�ر��̳߳�
		pool.shutdown();
	}
}

class MyRunnable implements Runnable
{
	private static AtomicLong aLong = new AtomicLong(10000); //ԭ������ÿ���̶߳��������ɲ���
	private String name; //������
	private int data; //������

	MyRunnable(String name, int data)
	{
		this.name = name;
		this.data = data;
	}
	public void run()
	{
		System.out.println(name + "ִ����" + data + "����ǰ��" + aLong.addAndGet(data));
	}
}
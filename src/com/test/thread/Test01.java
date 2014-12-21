package com.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test01
{
	public static void main(String[] args)
	{
		ExecutorService pool = Executors.newFixedThreadPool(2);
		Lock lock = new ReentrantLock(false);
		Runnable t1 = new MyRunnable01("����", 2000, lock);
		Runnable t2 = new MyRunnable01("����", 3600, lock);
		Runnable t3 = new MyRunnable01("����", 2700, lock);
		Runnable t4 = new MyRunnable01("����", 600, lock);
		Runnable t5 = new MyRunnable01("��ţ", 1300, lock);
		Runnable t6 = new MyRunnable01("����", 800, lock);
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

class MyRunnable01 implements Runnable
{
	private static AtomicLong aLong = new AtomicLong(10000); //ԭ������ÿ���̶߳��������ɲ���
	private String name; //������
	private int data; //������
	private Lock lock;

	MyRunnable01(String name, int data, Lock lock)
	{
		this.name = name;
		this.data = data;
		this.lock = lock;
	}

	public void run()
	{
		lock.lock();
		System.out.println(name + "ִ����" + data + "����ǰ��" + aLong.addAndGet(data));
		lock.unlock();
	}
}
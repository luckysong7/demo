package com.day16;

public class Test11 {
	public static void main(String[] args) {
		System.out.println("Main Thread Group : "
				+ Thread.currentThread().getThreadGroup());
		
		System.out.println("Main Thread Name : " + Thread.currentThread());
		
		Thread t1 = new Thread();
		
		System.out.println("t1 ������ �׷� : " + Thread.currentThread().getThreadGroup());
		System.out.println("t1 : " + t1); // ������ �̸� / �켱���� / �׷��
		
		// �Ϲ������� ������� ���� �׷쿡 ����
		
		ThreadGroup tg = new ThreadGroup("suzi"); // �׷��̸�
		
		Thread t2 = new Thread(tg,"t2");
		Thread t3 = new Thread(tg,"t3");
		
		System.out.println("t2 : " + t2);
		System.out.println("t3 : " + t3);
		
	}
}

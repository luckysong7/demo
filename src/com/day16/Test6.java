package com.day16;

//�������� �����ֱ� 

class MyThread6 extends Thread {

	@Override
	public void run() {

		try {
			System.out.println("������ ���� ... ");

			System.out.println("�켱���� : " + getPriority());

			System.out.println("������ �̸� : " + getName());

			// 0.5�� �޽�
			sleep(500);

			// �켱��������
			setPriority(2);

			System.out.println("����� �켱���� " + getPriority());

			System.out.println("������ ���� ... ");
		} catch (Exception e) {

		}
	}

}

public class Test6 {
	public static void main(String[] args) {

		Thread t1 = Thread.currentThread(); // t1 ���� ���� �����尡 �Էµȴ�.

		MyThread6 t2 = new MyThread6();

		System.out.println("���ν����� �켱���� : " + t1.getPriority());
		System.out.println("���ν����� �̸� : " + t1.getName());

		System.out.println("start �޼ҵ� ȣ���� isAlive : " + t2.isAlive());

		t2.start();

		System.out.println("t2�� �켱���� : " + t2.getPriority());

		t2.setPriority(1);

		try {
			Thread.sleep(100); // ���ν����尡 0.1�ʽ���.

			// t2�� ����Ǿ����� Ȯ��
			System.out.println("t2 ����ֳ� ? : " + t2.isAlive());

			// 1�� ����
			Thread.sleep(1000);
			System.out.println("1���� t2 ����ֳ� ? : " + t2.isAlive());

			t2.join(); // �������� t2 ����ɶ����� ��ٸ���� ���

			System.out.println("�׷��� t2 ����ֳ� ? : " + t2.isAlive());

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

package com.day16;

class MyThread2 implements Runnable {
	private int num;
	private String name;

	public MyThread2(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public void run() {

		int i = 0;
		while (i < num) {
			System.out.println(name + " : " + i);
			i++;

			try {
//				Thread.sleep(100); // 0.1 ��
			} catch (Exception e) {

			}
		}

	}

}

public class Test2 {

	public static void main(String[] args) {
		System.out.println("���� �κ� ���� ");

		Thread t1 = new Thread(new MyThread2(100, "ù��°"));
		Thread t2 = new Thread(new MyThread2(200, "�ι�°"));

		t1.start();
		t2.start();

		System.out.println("���� �κ� ����");
	}

}

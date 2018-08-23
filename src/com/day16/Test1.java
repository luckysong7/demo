package com.day16;

class MyThread1 extends Thread {

	private int num;
	private String name;

	public MyThread1(int num, String name) {
		this.num = num;
		this.name = name;

	}

	public void run() { // Thread 의 메소드 (반드시 구현해야 한다 !!)
		int i = 0;
		while (i < num) {
			System.out.println(this.getName() + ":" + name + i);
			i++;

			try {
//				sleep(2000); // 0.1초
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class Test1 {

	public static void main(String[] args) {

		System.out.println("Main 이 실행 되었습니다. ");

		MyThread1 t1 = new MyThread1(100, "첫번째");
		MyThread1 t2 = new MyThread1(200, "두번째");

		t1.start(); // 스레드 실행
		t2.start(); // 스레드 실행
		
		// 여기까지 실행된 스레드 3개(main, t1, t2)
		
		System.out.println("main 이 종료 되었습니다. ");
		
		
	}
}

package com.day16;

//스레드의 생명주기 

class MyThread6 extends Thread {

	@Override
	public void run() {

		try {
			System.out.println("스레드 시작 ... ");

			System.out.println("우선순위 : " + getPriority());

			System.out.println("스레드 이름 : " + getName());

			// 0.5초 휴식
			sleep(500);

			// 우선순위변경
			setPriority(2);

			System.out.println("변경된 우선순위 " + getPriority());

			System.out.println("스레드 종료 ... ");
		} catch (Exception e) {

		}
	}

}

public class Test6 {
	public static void main(String[] args) {

		Thread t1 = Thread.currentThread(); // t1 에는 메인 스레드가 입력된다.

		MyThread6 t2 = new MyThread6();

		System.out.println("메인스레드 우선순위 : " + t1.getPriority());
		System.out.println("메인스레드 이름 : " + t1.getName());

		System.out.println("start 메소드 호출전 isAlive : " + t2.isAlive());

		t2.start();

		System.out.println("t2의 우선순위 : " + t2.getPriority());

		t2.setPriority(1);

		try {
			Thread.sleep(100); // 메인스레드가 0.1초쉰다.

			// t2가 종료되었는지 확인
			System.out.println("t2 살아있나 ? : " + t2.isAlive());

			// 1초 슬립
			Thread.sleep(1000);
			System.out.println("1초후 t2 살아있나 ? : " + t2.isAlive());

			t2.join(); // 메인한테 t2 종료될때까지 기다리라고 명령

			System.out.println("그래도 t2 살아있나 ? : " + t2.isAlive());

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

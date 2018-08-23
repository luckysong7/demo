package com.day16;

// 인터럽트 
// 우선순위가 높은 프로그램을 먼저 실행하고
// 다시 돌아옴

class MyThread7 extends Thread {

	private Thread next;

	public void setNext(Thread next) {
		this.next = next;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {

			try {
				sleep(3000);

			} catch (Exception e) {

			}

			System.out.println(getName() + " : " + i);

			if (next.isAlive()) {
				next.interrupt(); // 다음 쓰레드를 깨워라
			}
		}
	}

}

public class Test7 {

	public static void main(String[] args) {

		System.out.println("메인 시작 ..");
		MyThread7 t1 = new MyThread7();
		MyThread7 t2 = new MyThread7();
		MyThread7 t3 = new MyThread7();

		// 스레드를 번갈아 가면서 실행
		t1.setNext(t2);
		t2.setNext(t3);
		t3.setNext(t1);

		t1.start();
		t2.start();
		t1.interrupt();
		t3.start();

		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("메인 종료 ..");
	}
}

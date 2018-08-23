package com.day16;

class MyThread9 implements Runnable {

	private int bank = 10000;

	private int getBank() {
		return bank;
	}

	private int drawMoney(int m) {
		if (getBank() > 0) {
			bank -= m;
			System.out.println(Thread.currentThread().getName() + " 인출 : " + m
					+ "잔액 : " + getBank());
		} else {
			m = 0;
			System.out.println(Thread.currentThread().getName() + " , 잔액부족 !!");
		}
		return m;
	}

	@Override
	public void run() {
		synchronized (this) {
			// 하나의 스레드가 사용중이면
			// 다른 스레드는 들어올수 없다.
			// 단 접근가능하게 하려면 wait를 사용
			for (int i = 1; i <= 10; i++) {
				if (getBank() <= 0) {
					this.notifyAll(); // 대기 상태의 스레드를 깨움
					break;
				}

				drawMoney(1000);
				if (getBank() == 2000 || getBank() == 4000 || getBank() == 6000
						|| getBank() == 8000) {
					try {
						wait(); // 현재 스레드의 일시정지
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				else {
					notify();
				}
			}
		}

	}

}

public class Test9 {
	public static void main(String[] args) {
		MyThread9 ob = new MyThread9();
		
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);
		
		t1.start();
		t2.start();
		
		
	}
}

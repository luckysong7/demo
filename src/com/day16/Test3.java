package com.day16;

import java.util.Calendar;

class Tclock implements Runnable {
	int num = 0;

	public Tclock(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		int i = 0;
		while (i < num) {
			Calendar now = Calendar.getInstance();
			System.out.printf("1�� �� �ð� : %1$tF %1$1tT \n", now);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			i++;
		}
	}

}

public class Test3 {
	public static void main(String[] args) {

//		Calendar now = Calendar.getInstance();
//		System.out.printf("ó�� �ð� : %1$tF %1$tT\n", now);

		Thread clock1 = new Thread(new Tclock(100));
		clock1.start();

	}

}

package com.day16;

import java.awt.Toolkit;

public class Test12 implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 3; i++) {
			toolkit.beep();
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		Runnable beepTask = new Test12();
		Thread thread = new Thread(beepTask);

		thread.start();
		
		for(int i = 0 ; i < 3 ; i++){
			System.out.println("¶¯");
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

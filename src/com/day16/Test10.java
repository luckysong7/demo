package com.day16;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;



//������ �ð��� Ư�� �۾��� �Ϸ��� �Ҷ� ��� 
// TimeTask


/*
 * ���� 0�� 0�� 0�� ���� �Ϸ翡 �ѹ��� �ݺ� 
 * d.add(Calendar.DATE,1); 
 * d.set(Calendar.HOUR,0);
 * // ���� 1�ô� 13�� d.set(Calendar.MINUTE,0); 
 * d.set(Calendar.SECOND,0);
 * d.set(Calendar.MILLSECOND t.schedule(task,d.getTime(),1000*60*60*24);
 * 1000�� �ð��� �и��������� ����(��,��,��)
 */

public class Test10 extends Thread {

	private int num = 0;

	public Test10() {

		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				// �ݺ������� �۾�
				num = 0;
			}
		};

		Timer t = new Timer();
		Calendar d = Calendar.getInstance();

		t.schedule(task, d.getTime(), 10000);

	}


	@Override
	public void run() {
		while (true) {
			System.out.println(num++);
			try {
				sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test10().start();
	}
}

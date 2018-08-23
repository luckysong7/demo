package com.day16;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;



//정해진 시간에 특정 작업을 하려고 할때 사용 
// TimeTask


/*
 * 내일 0시 0분 0초 부터 하루에 한번씩 반복 
 * d.add(Calendar.DATE,1); 
 * d.set(Calendar.HOUR,0);
 * // 오후 1시는 13시 d.set(Calendar.MINUTE,0); 
 * d.set(Calendar.SECOND,0);
 * d.set(Calendar.MILLSECOND t.schedule(task,d.getTime(),1000*60*60*24);
 * 1000은 시간을 밀리세컨으로 변경(초,분,시)
 */

public class Test10 extends Thread {

	private int num = 0;

	public Test10() {

		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				// 반복실행할 작업
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

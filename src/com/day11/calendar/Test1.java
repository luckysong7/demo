package com.day11.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test1 {

	public static void main(String[] args) {
		// 현재 시스템의 날짜 및 시간을 관리

		Calendar now = Calendar.getInstance(); // Calendar객체는 new 를 통해 객체 생성하지
												// 않음
		// Calendar now1 = new GregorianCalendar();

		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH) + 1; // 가져올때는 +1 입력할때는 -1
		int d = now.get(Calendar.DATE);
		int w = now.get(Calendar.DAY_OF_WEEK); // 주의 수 (1~7)
		// System.out.println(w);

		String[] week = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.println(y + "년" + m + "월" + d + "일" + week[w - 1]);

		int startDay = now.getActualMinimum(Calendar.DATE);
		int endDay = now.getActualMaximum(Calendar.DATE);

		System.out.println("시작일은 " + startDay + "일"); // 시작일
		System.out.println("마지막일은 " + endDay + "일"); // 마지막일

		System.out.printf("%tF\n", now);
		System.out.printf("%tT\n", now);

		System.out.printf("%1$tF %1$tT", now);
		System.out.println();

		now.set(2019, 10 - 1, 10);
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1; // 가져올때는 +1 입력할때는 -1
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK); // 주의 수 (1~7)
		System.out.println(y + "년" + m + "월" + d + "일" + week[w - 1]+ "요일");

		

	}
}

package com.day11.calendar;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) {

		// 오늘로부터 00 일 후 몇년 몇월 몇일 몇요일
		// 현재 : 2018년 5월 30일 수요일
		// 100일 후 :

		Calendar now = Calendar.getInstance();

		Scanner sc = new Scanner(System.in);

		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH) + 1; // 가져올때는 +1 입력할때는 -1
		int d = now.get(Calendar.DATE);
		int w = now.get(Calendar.DAY_OF_WEEK); // 주의 수 (1~7)

		String[] week = { "일", "월", "화", "수", "목", "금", "토" };

		int endDay = now.getActualMaximum(Calendar.DATE);

		System.out.println("현재날짜 : " + y + "년 " + m + "월 " + d + "일 "
				+ week[w - 1] + "요일");

		System.out.println("몇일 후 ? ");
		int num1 = sc.nextInt();
		int num2 = num1 + d; // 추가된 날짜 + 현재 날짜
//		System.out.println(num2);

		do {
			if (num2 > endDay) {

				now.set(Calendar.MONTH, m++);

				if (endDay == 31) {
					num2 -= 31;
				} else if (endDay == 30) {
					num2 -= 30;
				} else if (endDay == 29) {
					num2 -= 29;
				} else if (endDay == 28) {
					num2 -= 28;
				}

				now.set(Calendar.DATE, num2);
				endDay = now.getActualMaximum(Calendar.DATE);

			} else if (num2 <= endDay) {
				d = num2;
				now.set(Calendar.DATE, d);
			}

		} while (num2 > endDay);

		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1; // 가져올때는 +1 입력할때는 -1
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK); // 주의 수 (1~7)

		System.out.println(num1 + "일후 날짜 : " + y +"년 " + m + "월 " + d + "일 "
				+ week[w - 1] + "요일");

	}
}

package com.day4;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {

		// 년, 월, 일을 입력 받아 요일을 반환

		// 2018년 5월 21일 월요일

		int year;
		int month;
		int date;

		int week; // 주계산

		String day = "";

		int nalsu;

		int m[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Scanner sc = new Scanner(System.in);

		System.out.println("*********** 요일 반환 프로그램 ***********");

		do {
			System.out.println("년도를 입력해주세요 : ");
			year = sc.nextInt();
		} while (year < 1);

		do {
			System.out.println("월을 입력해주세요 : ");
			month = sc.nextInt();
		} while (month < 1 || month > 12);

		do {
			System.out.println("일을 입력해주세요 : ");
			date = sc.nextInt();
		} while (date < 1 || date > 31);

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			m[1] = 29;
		}

		nalsu = (year - 1) * 365 - (year - 1) / 4 - (year - 1) / 100
				+ (year - 1) / 400 + date ;

		for (int i = 0; i < month - 1; i++) {
			nalsu += m[i];
		}

		week = nalsu % 7;
		
		switch (week) {
		case 1:
			day = "월";
			break;
			
		case 2:
			day = "화";
			break;
			
		case 3:
			day = "수";
			break;
			
		case 4:
			day = "목";
			break;
			
		case 5:
			day = "금";
			break;
			
		case 6:
			day = "토";
			break;
			
		case 0:
			day = "일";
			break;
		}
		
		System.out.printf("%d 년 %d 월 %d 일은 \"%s\"요일 입니다.",year,month,date,day);

	}
}

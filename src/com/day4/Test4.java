package com.day4;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {

		// ��, ��, ���� �Է� �޾� ������ ��ȯ

		// 2018�� 5�� 21�� ������

		int year;
		int month;
		int date;

		int week; // �ְ��

		String day = "";

		int nalsu;

		int m[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Scanner sc = new Scanner(System.in);

		System.out.println("*********** ���� ��ȯ ���α׷� ***********");

		do {
			System.out.println("�⵵�� �Է����ּ��� : ");
			year = sc.nextInt();
		} while (year < 1);

		do {
			System.out.println("���� �Է����ּ��� : ");
			month = sc.nextInt();
		} while (month < 1 || month > 12);

		do {
			System.out.println("���� �Է����ּ��� : ");
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
			day = "��";
			break;
			
		case 2:
			day = "ȭ";
			break;
			
		case 3:
			day = "��";
			break;
			
		case 4:
			day = "��";
			break;
			
		case 5:
			day = "��";
			break;
			
		case 6:
			day = "��";
			break;
			
		case 0:
			day = "��";
			break;
		}
		
		System.out.printf("%d �� %d �� %d ���� \"%s\"���� �Դϴ�.",year,month,date,day);

	}
}

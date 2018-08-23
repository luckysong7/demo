package com.day11.calendar;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) {

		// ���÷κ��� 00 �� �� ��� ��� ���� �����
		// ���� : 2018�� 5�� 30�� ������
		// 100�� �� :

		Calendar now = Calendar.getInstance();

		Scanner sc = new Scanner(System.in);

		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH) + 1; // �����ö��� +1 �Է��Ҷ��� -1
		int d = now.get(Calendar.DATE);
		int w = now.get(Calendar.DAY_OF_WEEK); // ���� �� (1~7)

		String[] week = { "��", "��", "ȭ", "��", "��", "��", "��" };

		int endDay = now.getActualMaximum(Calendar.DATE);

		System.out.println("���糯¥ : " + y + "�� " + m + "�� " + d + "�� "
				+ week[w - 1] + "����");

		System.out.println("���� �� ? ");
		int num1 = sc.nextInt();
		int num2 = num1 + d; // �߰��� ��¥ + ���� ��¥
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
		m = now.get(Calendar.MONTH) + 1; // �����ö��� +1 �Է��Ҷ��� -1
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK); // ���� �� (1~7)

		System.out.println(num1 + "���� ��¥ : " + y +"�� " + m + "�� " + d + "�� "
				+ week[w - 1] + "����");

	}
}

package com.day11.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test1 {

	public static void main(String[] args) {
		// ���� �ý����� ��¥ �� �ð��� ����

		Calendar now = Calendar.getInstance(); // Calendar��ü�� new �� ���� ��ü ��������
												// ����
		// Calendar now1 = new GregorianCalendar();

		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH) + 1; // �����ö��� +1 �Է��Ҷ��� -1
		int d = now.get(Calendar.DATE);
		int w = now.get(Calendar.DAY_OF_WEEK); // ���� �� (1~7)
		// System.out.println(w);

		String[] week = { "��", "��", "ȭ", "��", "��", "��", "��" };
		System.out.println(y + "��" + m + "��" + d + "��" + week[w - 1]);

		int startDay = now.getActualMinimum(Calendar.DATE);
		int endDay = now.getActualMaximum(Calendar.DATE);

		System.out.println("�������� " + startDay + "��"); // ������
		System.out.println("���������� " + endDay + "��"); // ��������

		System.out.printf("%tF\n", now);
		System.out.printf("%tT\n", now);

		System.out.printf("%1$tF %1$tT", now);
		System.out.println();

		now.set(2019, 10 - 1, 10);
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1; // �����ö��� +1 �Է��Ҷ��� -1
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK); // ���� �� (1~7)
		System.out.println(y + "��" + m + "��" + d + "��" + week[w - 1]+ "����");

		

	}
}

package com.day15;

import java.util.Scanner;

public class Test5 {

	// 5-10 ���� ���ڿ��� �Է¹޾� ���
	// ���ڿ� ? abcde
	// abcde
	// ����
	// 1. 5-10 �� �̻����� Ȯ��
	// 2. ������(��ҹ��� ���о���)�� �Է�

	public void inputForm(String str) throws Exception {

		// ���� 1, 2
		if (str.length() < 5 || str.length() > 10) {

			throw new Exception("���� ������ ������ϴ�.");
		}

		for (int i = 0; i < str.length(); i++) {
			char chr = (char) str.charAt(i);
			if ((chr < 65 || chr > 90) && (chr < 97 || chr > 122)) {

			}
			// if (!(chr >= 'A' && chr <= 'Z') && !(chr >= 'a' && chr <= 'z')) {
			//
			// System.out.println("�����ڰ� �ƴմϴ�");
			// throw new Exception();
			// }
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str;
		Test5 ob = new Test5();

		try {
			System.out.print("���ڿ� ? ");
			str = sc.next();

			ob.inputForm(str); // ����üũ

			System.out.println(str);

		} catch (Exception e) {

			System.out.println(e.toString());
		}

	}
}

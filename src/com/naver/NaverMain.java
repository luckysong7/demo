package com.naver;

import java.util.Scanner;

public class NaverMain {
	public static void main(String[] args) throws Exception {
		Naver ob1 = new NaverImpl();

		Scanner sc = new Scanner(System.in);
		int ch = 0;

		while (true) {
			do {
				System.out.println("�ڡڡڡ� ���̹� ȸ�� ���� �ڡڡڡ�");
				System.out.print("1. ȸ������ 2. ������� 3. �̸��˻�");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					ob1.input();
					break;
				case 2:
					ob1.print();
					break;
				case 3:
					ob1.searchId();
					break;
				default:
					break;
				}
			} while (ch < 1);
		}
	}

}

package com.health;

import java.util.Scanner;

public class InfoMain {
	public static void main(String[] args) {
		Info info = new InfoImpl();
		Scanner sc = new Scanner(System.in);

		int ch; // ����ڰ� ������ ��ȣ ���� ����

		while (true) {

			do {

				System.out.println("*****************************************************");
				System.out.println();
				System.out.println("   1. �Է�   2. ���   3. �̸��˻�");
				System.out.println("   4. ����             5. ������ ����");
				System.out.println("   6. ������ ��� ���� 7. ȸ������ Ű������� ����");
				System.out.println();
				System.out.println("*****************************************************");
				ch = sc.nextInt();

			} while (ch < 1);

			switch (ch) {
			case 1:
				info.input();
				break;
			case 2:
				info.print();
				break;
			case 3:
				info.findName();
				break;
			case 4:
				info.delete();
				break;
			case 5:
				info.insert();
				break;
			case 6:
				info.showAvgOfWeight();
				break;
			case 7:
				info.printOrderbyHeight();
				break;

			default:
				System.exit(0);
				break;
			}

		}

	}
}

package com.score8_0717;

import java.util.Scanner;

import com.db.DBConn;

public class ScoreMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Score ob = new Score();
		int ch;

		while (true) {
			do {
				System.out
						.print("1. �Է� 2. ���� 3. ���� 4. ��ü��� 5. �й� �˻�  6. ���� : ");
				ch = sc.nextInt();
			} while (ch < 1 || ch > 6);

			switch (ch) {
			case 1:
				ob.insert();
				break;

			case 2:
				ob.update();
				break;

			case 3:
				ob.delete();
				break;

			case 4:
				ob.selectAll();
				break;

			case 5:
				ob.searchHak();
				break;

			case 6:
				DBConn.close();
				System.exit(0);
			}
		}

	}
}

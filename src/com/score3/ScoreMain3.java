package com.score3;

import java.util.Scanner;

public class ScoreMain3 {
	public static void main(String[] args) {
		Score2 ob1 = new ScoreImpl2();
		Scanner sc = new Scanner(System.in);

		int ch;

		while (true) {

			do {
				System.out.print("1. �Է� 2. ��� \n"
						+ "3. �й��˻� 4. �̸��˻� \n"
						+ "5. ���� �������� ���� 6. �й� �������� ���� 7. ���� : ");
				ch = sc.nextInt();

			} while (ch < 1);

			switch (ch) {

			case 1:
				ob1.input();
				break;
				
			case 2:
				ob1.print();
				break;
				
			case 3:
				ob1.searchHak();
				System.out.println(ob1.toString());
				break;
				
			case 4:
				ob1.searchName();
				break;
				
			case 5:
				ob1.descSortTot();
				break;
				
			case 6:
				ob1.ascSortHak();
				break;

			default:
				System.exit(0); // ���α׷� ���� Yes - 0 No - 1 Cancel - 2
				break;
			}
		}
	}
}

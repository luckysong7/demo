package com.score4;

import java.util.Scanner;

import com.score3.ScoreImpl2;

public class ScoreMain {
	public static void main(String[] args) {

		Score ob1 = new ScoreImpl();
		Scanner sc = new Scanner(System.in);

		int ch;

		while (true) {

			do {
				System.out.print("1. �Է� 2. ��� \n" + "3. ���� 4. ���� \n"
						+ "5. �̸��˻� 6. �й��˻� 7. ���� : ");
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
				ob1.remove();
				
				break;

			case 4:
				ob1.insert(); 
				break;

			case 5:
				
				ob1.findName();
				break;

			case 6:
				
				ob1.findHak();
				break;

			default:
				System.exit(0); // ���α׷� ���� Yes - 0 No - 1 Cancel - 2
				break;
			}
		}
	}
}

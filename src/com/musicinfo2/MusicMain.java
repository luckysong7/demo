package com.musicinfo2;

import java.util.Scanner;

public class MusicMain {
	public static void main(String[] args) {
		Music ob1 = new MusicImpl();
		Scanner sc = new Scanner(System.in);

		int ch;

		while (true) {
			do {
				System.out.println("1. ���� ���� �Է� 2. ���� ��� ��� \n"
						+ "3. ���� �������� ���� 4. �������� �������� \n"
						+ "5. ����");
				ch = sc.nextInt();
			} while (ch < 1);
		}

	}
}

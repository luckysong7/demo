package com.day5;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) throws IOException {

		int com = 0;
		int user = 0;

		char command = 'a';
		int result = 0;
		final int ROCK = 1;
		final int SCISSORS = 2;
		final int PAPPER = 3;

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		// ��ǻ�� ���������� ����
		com = rd.nextInt(3)+1;

		do {
			System.out.println("************���� ���� �� ���� ���α׷�************");
			System.out.println("1: ���� 2. ���� 3. ��");

			// ����� �Է�
			user = sc.nextInt();
			
			switch (com) { // ��ǻ��
			case ROCK:
				if (user == 1) { // �����
					result = 1;
					
				}
				if (user == 2) {
					result = 2;
					
				}
				if (user == 3) {
					result = 3;
					
				}
				System.out.println("��ǻ�ʹ� �����Դϴ�.");
				break;
				
			case SCISSORS:
				if (user == 3) { // �����
					result = 1;
				
				}
				if (user == 1) {
					result = 2;
				}
				if (user == 2) {
					result = 3;
				}
				System.out.println("��ǻ�ʹ� �����Դϴ�.");
				break;

			case PAPPER:
				if (user == 2) { // �����
					result = 1;
				}
				if (user == 3) {
					result = 2;
				}
				if (user == 1) {
					result = 3;
				}
				System.out.println("��ǻ�ʹ� ���Դϴ�.");
				break;
			}

			switch (result) {
			case 1:
				System.out.println("��ǻ�Ͱ� �̰���ϴ٤Ф�");
				break;
			case 2:
				System.out.println("�����ϴ�.");
				break;
			case 3:
				System.out.println("����� �̰���ϴ�! �����մϴ�.");
				break;
			}

			System.out.println("=================================");
			System.out.println("����Ͻðڽ��ϱ�? [Y/N]");
			command = (char)System.in.read();
		} while (command != 'N' && command != 'n');

	}
}

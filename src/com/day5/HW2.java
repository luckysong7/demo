package com.day5;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) throws IOException {

		int number = 0;

		int answer = 0;
		int count ;
		char command = 'a';

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		// number[i] = random.nextInt(10) + 1;

		System.out.println("******** ���� ���߱� ���� ********");

		do {
			number = (int) (Math.random() * 10) + 1;
			System.out.println(">> ���� ���� �Ϸ� ");
			System.out.println();
			count = 1;
			while (count < 4) {
				System.out.println("���� �Է� ?" + "[" + count + "��°��ȸ]");
				answer = sc.nextInt();
				if (answer == number) {
					System.out.println("�����Դϴ�! ");
					break; // ����
				} else {
					System.out.println("Ʋ�Ⱦ��!!");

					if (count == 3) {
						System.out.println("������\" " + number + "\"�Դϴ�\n");

					}
					count++;
				}
			}
			System.out.println("����ҷ� ? [Y/N]");
			command = (char) System.in.read();
		} while (command != 'N' && command != 'n');
	}
}

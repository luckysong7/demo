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

		System.out.println("******** 숫자 맞추기 게임 ********");

		do {
			number = (int) (Math.random() * 10) + 1;
			System.out.println(">> 난수 생성 완료 ");
			System.out.println();
			count = 1;
			while (count < 4) {
				System.out.println("정수 입력 ?" + "[" + count + "번째기회]");
				answer = sc.nextInt();
				if (answer == number) {
					System.out.println("정답입니다! ");
					break; // 종료
				} else {
					System.out.println("틀렸어요!!");

					if (count == 3) {
						System.out.println("정답은\" " + number + "\"입니다\n");

					}
					count++;
				}
			}
			System.out.println("계속할래 ? [Y/N]");
			command = (char) System.in.read();
		} while (command != 'N' && command != 'n');
	}
}

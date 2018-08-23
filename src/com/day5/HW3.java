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

		// 컴퓨터 가위바위보 생성
		com = rd.nextInt(3)+1;

		do {
			System.out.println("************가위 바위 보 게임 프로그램************");
			System.out.println("1: 가위 2. 바위 3. 보");

			// 사용자 입력
			user = sc.nextInt();
			
			switch (com) { // 컴퓨터
			case ROCK:
				if (user == 1) { // 사용자
					result = 1;
					
				}
				if (user == 2) {
					result = 2;
					
				}
				if (user == 3) {
					result = 3;
					
				}
				System.out.println("컴퓨터는 바위입니다.");
				break;
				
			case SCISSORS:
				if (user == 3) { // 사용자
					result = 1;
				
				}
				if (user == 1) {
					result = 2;
				}
				if (user == 2) {
					result = 3;
				}
				System.out.println("컴퓨터는 가위입니다.");
				break;

			case PAPPER:
				if (user == 2) { // 사용자
					result = 1;
				}
				if (user == 3) {
					result = 2;
				}
				if (user == 1) {
					result = 3;
				}
				System.out.println("컴퓨터는 보입니다.");
				break;
			}

			switch (result) {
			case 1:
				System.out.println("컴퓨터가 이겼습니다ㅠㅠ");
				break;
			case 2:
				System.out.println("비겼습니다.");
				break;
			case 3:
				System.out.println("당신이 이겼습니다! 축하합니다.");
				break;
			}

			System.out.println("=================================");
			System.out.println("계속하시겠습니까? [Y/N]");
			command = (char)System.in.read();
		} while (command != 'N' && command != 'n');

	}
}

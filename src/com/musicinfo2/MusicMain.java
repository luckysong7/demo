package com.musicinfo2;

import java.util.Scanner;

public class MusicMain {
	public static void main(String[] args) {
		Music ob1 = new MusicImpl();
		Scanner sc = new Scanner(System.in);

		int ch;

		while (true) {
			do {
				System.out.println("1. 음악 정보 입력 2. 음악 목록 출력 \n"
						+ "3. 평점 내림차순 정렬 4. 음악제목 오름차순 \n"
						+ "5. 종료");
				ch = sc.nextInt();
			} while (ch < 1);
		}

	}
}

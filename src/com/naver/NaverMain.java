package com.naver;

import java.util.Scanner;

public class NaverMain {
	public static void main(String[] args) throws Exception {
		Naver ob1 = new NaverImpl();

		Scanner sc = new Scanner(System.in);
		int ch = 0;

		while (true) {
			do {
				System.out.println("★★★★ 네이버 회원 가입 ★★★★");
				System.out.print("1. 회원가입 2. 정보출력 3. 이름검색");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					ob1.input();
					break;
				case 2:
					ob1.print();
					break;
				case 3:
					ob1.searchId();
					break;
				default:
					break;
				}
			} while (ch < 1);
		}
	}

}

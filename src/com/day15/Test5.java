package com.day15;

import java.util.Scanner;

public class Test5 {

	// 5-10 자의 문자열을 입력받아 출력
	// 문자열 ? abcde
	// abcde
	// 조건
	// 1. 5-10 자 이상인지 확인
	// 2. 영문자(대소문자 구분없이)만 입력

	public void inputForm(String str) throws Exception {

		// 조건 1, 2
		if (str.length() < 5 || str.length() > 10) {

			throw new Exception("문자 범위를 벗어났습니다.");
		}

		for (int i = 0; i < str.length(); i++) {
			char chr = (char) str.charAt(i);
			if ((chr < 65 || chr > 90) && (chr < 97 || chr > 122)) {

			}
			// if (!(chr >= 'A' && chr <= 'Z') && !(chr >= 'a' && chr <= 'z')) {
			//
			// System.out.println("영문자가 아닙니다");
			// throw new Exception();
			// }
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str;
		Test5 ob = new Test5();

		try {
			System.out.print("문자열 ? ");
			str = sc.next();

			ob.inputForm(str); // 오류체크

			System.out.println(str);

		} catch (Exception e) {

			System.out.println(e.toString());
		}

	}
}

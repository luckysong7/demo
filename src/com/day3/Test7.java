package com.day3;

import java.io.IOException;
import java.util.Scanner;

public class Test7 {
	private static Scanner sc;

	public static void main(String[] args) throws IOException {
		sc = new Scanner(System.in);

		int n;

		System.out.println("1~3이내의 수?");
		n = sc.nextInt();

		switch (n) {
		case 3:
			System.out.println("***");
			break;
		case 2:
			System.out.println("**");
			break;
		case 1:
			System.out.println("*");
			break;
		default:
			System.out.println("숫자입력 오류 ! ");
			break; // 생략 가능 (생략할 수 있으면 생략하자)
		}
	}
}

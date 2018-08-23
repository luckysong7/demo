package com.health;

import java.util.Scanner;

public class InfoMain {
	public static void main(String[] args) {
		Info info = new InfoImpl();
		Scanner sc = new Scanner(System.in);

		int ch; // 사용자가 선택한 번호 받을 변수

		while (true) {

			do {

				System.out.println("*****************************************************");
				System.out.println();
				System.out.println("   1. 입력   2. 출력   3. 이름검색");
				System.out.println("   4. 삭제             5. 몸무게 수정");
				System.out.println("   6. 몸무게 평균 보기 7. 회원들의 키순서대로 정렬");
				System.out.println();
				System.out.println("*****************************************************");
				ch = sc.nextInt();

			} while (ch < 1);

			switch (ch) {
			case 1:
				info.input();
				break;
			case 2:
				info.print();
				break;
			case 3:
				info.findName();
				break;
			case 4:
				info.delete();
				break;
			case 5:
				info.insert();
				break;
			case 6:
				info.showAvgOfWeight();
				break;
			case 7:
				info.printOrderbyHeight();
				break;

			default:
				System.exit(0);
				break;
			}

		}

	}
}

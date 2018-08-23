package com.score3;

import java.util.Scanner;

public class ScoreMain3 {
	public static void main(String[] args) {
		Score2 ob1 = new ScoreImpl2();
		Scanner sc = new Scanner(System.in);

		int ch;

		while (true) {

			do {
				System.out.print("1. 입력 2. 출력 \n"
						+ "3. 학번검색 4. 이름검색 \n"
						+ "5. 총점 내림차순 정렬 6. 학번 오름차순 정렬 7. 종료 : ");
				ch = sc.nextInt();

			} while (ch < 1);

			switch (ch) {

			case 1:
				ob1.input();
				break;
				
			case 2:
				ob1.print();
				break;
				
			case 3:
				ob1.searchHak();
				System.out.println(ob1.toString());
				break;
				
			case 4:
				ob1.searchName();
				break;
				
			case 5:
				ob1.descSortTot();
				break;
				
			case 6:
				ob1.ascSortHak();
				break;

			default:
				System.exit(0); // 프로그램 종료 Yes - 0 No - 1 Cancel - 2
				break;
			}
		}
	}
}

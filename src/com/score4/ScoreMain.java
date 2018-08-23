package com.score4;

import java.util.Scanner;

import com.score3.ScoreImpl2;

public class ScoreMain {
	public static void main(String[] args) {

		Score ob1 = new ScoreImpl();
		Scanner sc = new Scanner(System.in);

		int ch;

		while (true) {

			do {
				System.out.print("1. 입력 2. 출력 \n" + "3. 삭제 4. 수정 \n"
						+ "5. 이름검색 6. 학번검색 7. 종료 : ");
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
				ob1.remove();
				
				break;

			case 4:
				ob1.insert(); 
				break;

			case 5:
				
				ob1.findName();
				break;

			case 6:
				
				ob1.findHak();
				break;

			default:
				System.exit(0); // 프로그램 종료 Yes - 0 No - 1 Cancel - 2
				break;
			}
		}
	}
}

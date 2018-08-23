package com.day19.score5;

import java.io.IOException;
import java.util.Scanner;

public class ScoreMain {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Score ob = new Score();
		Scanner sc = new Scanner(System.in);
		int ch;

		while (true) {
			do {
				System.out.println("1. 입력 2. 출력 3. 저장 4. 종료");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					ob.input();
					break;
				case 2:
					ob.print();
					break;
				case 3:
					ob.writeFile();
					break;
				case 4:
					ob.writeFile();
					System.exit(0);

				}
			} while (ch < 1 || ch > 4);
		}
	}
}

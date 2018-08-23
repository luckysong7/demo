package com.day18.HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) throws Exception {

		Student ob = new StudentImpl();
		
		
		Scanner sc = new Scanner(System.in);
		
		int ch = 0;

		while (true) {
			do {
				System.out.print("1. 입력 2. 출력 3. 저장 => ");
				ch = sc.nextInt();

				switch (ch) {
				case 1:
					ob.input();
					break;
				case 2:
					ob.print();
					break;
				case 3:
					ob.exit();
				}
			} while (ch < 1);
		}

	}
}

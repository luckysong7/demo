package com.day3;

import java.util.Scanner;



public class TempMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Member ob = new Member();

		int ch;

		while (true) {

			do {
				System.out
						.print("1.ȸ������\n2.���\n3.����\n");
				ch = sc.nextInt();
			} while (ch < 1);
			
			switch(ch){
			
			case 1:
				ob.signup();
				break;
			case 2:
				ob.printMemberInfo();
				break;
			case 3:
				System.exit(0);
				break;
		
			default:
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
		}

		
	}

}

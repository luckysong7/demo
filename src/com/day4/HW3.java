package com.day4;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {

		boolean check = true; // '+'
		int sum = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (check == true) {
				sum += i;
				check = false; // '-'
			} else if (check == false) {
				sum -= i;
				check = true;
			}
		}
		System.out.println(sum);
	}
}

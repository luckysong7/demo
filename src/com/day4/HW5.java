package com.day4;

import java.util.Scanner;

public class HW5 {
	public static void main(String[] args) {
		
		int num1, num2;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�μ��� �Է����ּ��� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 >= num2){
			for(int i = num2 ; i <= num1 ; i++){
				sum += i;
			}
			System.out.printf("%d�� %d ���� ������ �� : %d" , num2, num1, sum);
		} else if(num1 <= num2){
			for(int i = num1 ; i <= num2 ; i++){
				sum += i;
			}	
			System.out.printf("%d�� %d ���� ������ �� : %d" , num1, num2, sum);
		}
		
		
	}
}

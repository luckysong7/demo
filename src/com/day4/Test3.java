package com.day4;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		//����޷�
		Scanner sc = new Scanner(System.in);
		
		//���� ��¥���� �迭����
		
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};

		int y,m,nalsu,i,week;
		
		do{
			System.out.println("�⵵ ? ");
			y = sc.nextInt();
		}while(y<1);
		
		do{
			System.out.println("�� ? ");
			m = sc.nextInt();
		}while(m<1 || m>12);
		
		if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0 ){
			months[1]= 29;
		}
		
		//1��1��1�Ϻ��� ���⵵(y-1) 12�� 31�ϱ����� ����
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		
		//����
		for(i = 0 ; i < m-1 ; i++){
		
			nalsu += months[i];
			
		}
		
		//y�� m�� d�ϱ����� ����
		
		nalsu = nalsu +1;
		
		//���Ǽ� ���
		
		week = nalsu % 7 ;
		
//		System.out.println(week);
		System.out.print("----------------------------- ");
		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  �� ");
		
		// Ư�� ���� ���� �����ϵ��� ������ ����
		
		for(i = 0 ; i < week ; i++){
			System.out.print("    "); // 4����Ʈ ���� 4ĭ
		}
		
		// �ش� ���� ��¥�� ��� 
		
		for(i = 1 ; i <= months[m-1]; i++){
			System.out.printf("%4d",i);
			week++;
			if(week % 7 == 0 ){
				System.out.println();
			}			
		}
		if(week % 7 != 0){
			System.out.println();
		}
			
	}
	
}

package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		[�ڷ���]
		boolean : true / false
		byte : -128 ~ 127
		short : -32768 ~ 32767
		int : 4byte
		long : 8byte
		
		10���� : 10 (Ư���� ������ ������ 10������ �ν�)
		8���� : 012 (0���� �����ϸ� 8������ �ν�)
		16���� : 0xA (0x ���� �����ϸ� 16������ �ν�)
		
		[����]
		char : 2byte(UTF-8):'a'
		
		[������]
		+ - / 
		
		[������ ������]
		> >= <= <
		
		[�������]
		== !=
		
		[��������]
		&& || !
		
		[��Ʈ����]
		& | ~ << >> >>>
		
		[���׿�����]
		(����) ? (���϶��� ��) : (�����϶��� ��) 
		
		[���Կ�����]
		= += -= *=
		
		�Ͻ��� ����ȯ 
		����� ����ȯ
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		double result = 0;
		char operation;
		
		System.out.println("ù��° �� : ");
		num1 = sc.nextInt();
		
		System.out.println("�ι�° �� : ");
		num2 = sc.nextInt();
		
		System.out.println("������[+,-,*,/] : ");
		operation = (char) System.in.read();
		
		switch(operation){

		case '+' :
			result = num1+num2;
			break;
		case '-' :
			result = num1-num2;
			break;
		case '*' :
			result = num1*num2;
			break;
		case '/' :
			result = (float)num1/(float)num2;
			break;

		}
		
		System.out.printf("%d %c %d = %.2f" , num1, operation, num2, result);
		
	}

}

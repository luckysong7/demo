package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		[자료형]
		boolean : true / false
		byte : -128 ~ 127
		short : -32768 ~ 32767
		int : 4byte
		long : 8byte
		
		10진수 : 10 (특별한 선언이 없으면 10진수로 인식)
		8진수 : 012 (0으로 시작하면 8진수로 인식)
		16진수 : 0xA (0x 으로 시작하면 16진수로 인식)
		
		[문자]
		char : 2byte(UTF-8):'a'
		
		[연산자]
		+ - / 
		
		[관계형 연산자]
		> >= <= <
		
		[등가연산자]
		== !=
		
		[논리연산자]
		&& || !
		
		[비트단위]
		& | ~ << >> >>>
		
		[삼항연산자]
		(조건) ? (참일때의 값) : (거짓일때의 값) 
		
		[대입연산자]
		= += -= *=
		
		암시적 형변환 
		명시적 형변환
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		double result = 0;
		char operation;
		
		System.out.println("첫번째 수 : ");
		num1 = sc.nextInt();
		
		System.out.println("두번째 수 : ");
		num2 = sc.nextInt();
		
		System.out.println("연산자[+,-,*,/] : ");
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

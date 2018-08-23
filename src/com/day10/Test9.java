package com.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class TestA {

	public void print(String r) {
		System.out.println(r);
	}
}

class Calc extends TestA {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int num1, num2;
	String oper;
	int result = 0;
	
	String s; // 출력 

	// 2개의 숫자 입력 받기
	public void input() throws IOException {
		System.out.print("두 수[5,2] ? "); // 5,3,8 
		String str = br.readLine();
		str = str.replaceAll("\\s", "");
		String[] n1 = str.split(",");
		num1 = Integer.parseInt(n1[0]);
		num2 = Integer.parseInt(n1[1]);
		
		System.out.println(n1[2]);
		
	}

	// 연산자 입력 받기

	public void input2() throws IOException {
		System.out.print("연산자 입력 : ");
		oper = br.readLine();
		oper = oper.replaceAll("\\s", "");
		
	}

	// 연산 수행
	public void operation() {
		if (oper.equals("+")) {
			result = num1 + num2;
		}
		if (oper.equals("-")) {
			result = num1 - num2;
		}
		if (oper.equals("*")) {
			result = num1 * num2;
		}
		if (oper.equals("/")) {
			result = num1 / num2;
		}
		
		s = String.format("%d %s %d = %d", num1, oper, num2, result);
	}
	
	

}

public class Test9 {
	public static void main(String[] args) throws IOException {
		
		Calc obj1 = new Calc();
		obj1.input();
		obj1.input2();
		obj1.operation();
		obj1.print(obj1.s);
		

	}
}

package com.day9;

import java.io.IOException;
import java.util.Scanner;

class Calc {

	private int num1, num2;

	private char oper;

	public boolean input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수 ? ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.println("연산자 ? ");
		try {
			oper = (char) System.in.read(); // + ,-,*,/
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 연산자 확인
		if (oper != '+' && oper != '-' && oper != '*' && oper != '/') {
			return false;
		}

		return true;

	}

	public int result() {
		int r = 0;
		switch (oper) {
		case '+':
			r = num1 + num2;
		case '-':
			r = num1 - num2;
		case '*':
			r = num1 * num2;
		case '/':
			r = num1 / num2;
		}
		return r;
	}

}

public class Test6 {
	public static void main(String[] args) {
		Calc obj = new Calc();
		
		boolean b = obj.input();
		
//		if(b == true){
//			System.out.println(obj.result());
//			
//		}else{
//			
//		}
		
//		if(obj.input()){ // 복잡한 작업을 if문 안에 두면 좋지 않은 코딩
//			System.out.println(obj.result());
//		}else{
//			return ;
//		}
		
		// 예외처리 느낌 
		// 밑에 문장들은 실행하지 마라
		if(!obj.input()){   // if문안에 조건문에서 ! 잘쓰자 
			
			// !false 가 투르가 
			return; // stop
		}
		
		int r = obj.result();
		System.out.println(r);
		
		System.out.println(obj.result());
		
		
	}
}

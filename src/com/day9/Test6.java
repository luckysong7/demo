package com.day9;

import java.io.IOException;
import java.util.Scanner;

class Calc {

	private int num1, num2;

	private char oper;

	public boolean input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� ? ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.println("������ ? ");
		try {
			oper = (char) System.in.read(); // + ,-,*,/
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ������ Ȯ��
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
		
//		if(obj.input()){ // ������ �۾��� if�� �ȿ� �θ� ���� ���� �ڵ�
//			System.out.println(obj.result());
//		}else{
//			return ;
//		}
		
		// ����ó�� ���� 
		// �ؿ� ������� �������� ����
		if(!obj.input()){   // if���ȿ� ���ǹ����� ! �߾��� 
			
			// !false �� ������ 
			return; // stop
		}
		
		int r = obj.result();
		System.out.println(r);
		
		System.out.println(obj.result());
		
		
	}
}

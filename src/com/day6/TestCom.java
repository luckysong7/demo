package com.day6;

import java.util.Scanner;




public class TestCom {
	//��������
	int w,h;
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ? ");
		w = sc.nextInt();
		System.out.println();
		System.out.print("���� ? ");
		h = sc.nextInt();
	}
	
	public int area(){
		int result;
		
		result = w *h;
		
		return result; // ���̰� ��ȯ
	}
	
	public int length(){
		
		return (w+h)*2; // ���� ��ȯ
		
	}
	
	public void print(int a, int l){
		System.out.println("���� : " + w );
		System.out.println("���� : " + h );
		System.out.println("���� : " + a );
		System.out.println("�ѷ� : " + l );
	}
}

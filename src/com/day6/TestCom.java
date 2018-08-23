package com.day6;

import java.util.Scanner;




public class TestCom {
	//전역변수
	int w,h;
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 ? ");
		w = sc.nextInt();
		System.out.println();
		System.out.print("세로 ? ");
		h = sc.nextInt();
	}
	
	public int area(){
		int result;
		
		result = w *h;
		
		return result; // 넓이값 반환
	}
	
	public int length(){
		
		return (w+h)*2; // 길이 반환
		
	}
	
	public void print(int a, int l){
		System.out.println("가로 : " + w );
		System.out.println("세로 : " + h );
		System.out.println("넓이 : " + a );
		System.out.println("둘레 : " + l );
	}
}

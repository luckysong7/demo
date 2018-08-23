package com.day7;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		Hap hap = new Hap();
		hap.input();
		int sum = hap.cnt();
		hap.print();
	}
	
	
}

class Hap{
	int su, sum; // 초기화 시켜줄 필요 없음
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 ? ");
		su = sc.nextInt();
	}
	
	public int cnt(){
		for(int i = 1 ; i <= su; i++){
			sum += i;
		}
		return sum;
	}
	
	public void print(){
		System.out.println("합계 : " + sum);
	}
	
}
package com.day5;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Random rd = new Random();
		
		
		
		int n = 0 ; 
		
		int number = 0 ;
		
		System.out.print("���� �ζ� ���� : ");
		number = sc.nextInt();
		number *= 6;
		
		int[] num = new int[number];// �迭���� int �� 0 String �� null �� �ʱ�ȭ �ȴ� .
		
		while(n < num.length){
			
			//num[n] = rd.nextInt(45) + 1 ;
			num[n] = (int)(Math.random()*45+1);
			
		
			System.out.print(num[n] + "\t");
			n++;
			if(n % 6 == 0) {
				System.out.println("");
			}
		}
		
//		for(int j = 0 ; j < num.length ; j++){
//			
//		}
		
	}
}

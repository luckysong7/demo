package com.day5;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Random rd = new Random();
		
		
		
		int n = 0 ; 
		
		int number = 0 ;
		
		System.out.print("뽑을 로또 개수 : ");
		number = sc.nextInt();
		number *= 6;
		
		int[] num = new int[number];// 배열에서 int 는 0 String 은 null 로 초기화 된다 .
		
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

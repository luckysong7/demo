package com.day5;

import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) {
		int num[] = new int[5];
		int temp = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력해주세요");
		for(int i = 0 ; i < num.length; i++){
			num[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < num.length -1 ; i++){
			for(int j = i ; j < num.length ; j++){
				if(num[j] > num[i]){					
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("");
		System.out.println(">> 가장 큰 수 : " + num[0]);
		System.out.println(">> 가장 작은 수 : " + num[num.length-1]);
		
	}
}

// arr[0] arr[1] arr[2] arr[3]
